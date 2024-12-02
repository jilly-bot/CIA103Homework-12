package hw9;

import java.util.Random;

class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("媽媽存了" + amount + "帳戶共有：" + balance);
        notify();
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("熊大餘額不足，等待媽媽匯款...");
                wait();
                System.out.println("熊大被老媽通知帳戶已經有錢！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
    }

    public synchronized int getBalance() {
        return balance;
    }
}

class MomThread extends Thread {
	Random rand = new Random();
    private Account account;

    public MomThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        	if (account.getBalance() >= 3000) {
        		System.out.println("媽媽看到餘額在3000以上，暫停匯款");
        	} else {
        		account.deposit(2000);
        	}            

            try {
                Thread.sleep(rand.nextInt(2501) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SonThread extends Thread {
	Random rand = new Random();
    private Account account;

    public SonThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        	
        	if (account.getBalance() < 2000) {
        		System.out.println("熊大看到餘額在2000以下，要求匯款");
        	}

        	if (account.getBalance() < 1000) {
        		System.out.println("熊大看到帳戶沒錢，暫停提款");
        	} else {
                account.withdraw(1000);
                System.out.println("熊大領了1000，帳戶共有：" + account.getBalance());
        	}

            try {
                Thread.sleep(rand.nextInt(2501) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Hw9_2 {
	public static void main(String[] args) {
        Account account = new Account(2000);

        MomThread momThread = new MomThread(account);
        SonThread sonThread = new SonThread(account);

        momThread.start();
        sonThread.start();

        try {
            momThread.join();
            sonThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
