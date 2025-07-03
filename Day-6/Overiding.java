class Bank {
  String name = "Generic Bank";

  void displayBankInfo() {
    System.out.println("Welcome to " + name);
  }

  double getInterestRate() {
    return 4.0;
  }
}

class SBI extends Bank {
  SBI() {
    name = "SBI Bank";
  }

  @Override
  void displayBankInfo() {
    super.displayBankInfo(); // Call parent method
    System.out.println("SBI provides good customer service.");
  }

  @Override
  double getInterestRate() {
    return 6.5;
  }
}

class HDFC extends Bank {
  HDFC() {
    name = "HDFC Bank";
  }

  @Override
  void displayBankInfo() {
    super.displayBankInfo();
    System.out.println("HDFC provides excellent net banking.");
  }

  @Override
  double getInterestRate() {
    return 7.0;
  }
}

class ICICI extends Bank {
  ICICI() {
    name = "ICICI Bank";
  }

  @Override
  void displayBankInfo() {
    super.displayBankInfo();
    System.out.println("ICICI offers best mobile banking.");
  }

  @Override
  double getInterestRate() {
    return 6.8;
  }
}

public class Overiding {
  public static void main(String[] args) {
    Bank bank;

    bank = new SBI();
    bank.displayBankInfo();
    System.out.println("Interest Rate: " + bank.getInterestRate() + "%\n");

    bank = new HDFC();
    bank.displayBankInfo();
    System.out.println("Interest Rate: " + bank.getInterestRate() + "%\n");

    bank = new ICICI();
    bank.displayBankInfo();
    System.out.println("Interest Rate: " + bank.getInterestRate() + "%");
  }
}
