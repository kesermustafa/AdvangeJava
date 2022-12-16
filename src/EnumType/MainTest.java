package EnumType;

public class MainTest {

    public static void main(String[] args) {


        useConstantMethod(1);
        useConstantMethod(2);
        useConstantMethod(3);
        useConstantMethod(4);
        useConstantMethod(100);
        useConstantMethod(7); // olmadigi halde hata vermedi

        System.out.println("--------------------");

        useEnumMethod(TransactionType.DEPOSIT);
        useEnumMethod(TransactionType.WITHDRAW);
        useEnumMethod(TransactionType.TRANSFER);
        useEnumMethod(TransactionType.PAYMENT);
        useEnumMethod(TransactionType.OTHER);
      //  useEnumMethod(TransactionType....); olmayan deger giremezsin...

        System.out.println("--------------------");
        enumMethodlar(TransactionType.WITHDRAW);


    }


    // eski tarz
    private static void useConstantMethod(int i){

        if(i==TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is depositing");
        }else if(i==TransactionTypeConstant.WITHDRAW){
            System.out.println("Money is withdrawing");
        }else if(i== TransactionTypeConstant.TRANSFER){
            System.out.println("Money is trasfering");
        }else if(i==TransactionTypeConstant.PAYMENT){
            System.out.println("Money is paymenting");
        }else if(i==TransactionTypeConstant.OTHER){
            System.out.println("Order transaction");
        }
    }

    //Enum yapi

    private static void useEnumMethod(TransactionType transactionType){
        if(transactionType==TransactionType.DEPOSIT){
            System.out.println("Money is depositing");
        }else if(transactionType==TransactionType.PAYMENT){
            System.out.println("Money is paymenting");
        }else if(transactionType==TransactionType.WITHDRAW){
            System.out.println("Money is withdrawing");
        }else if(transactionType==TransactionType.TRANSFER){
            System.out.println("Money is trasfering");
        }else if(transactionType==TransactionType.OTHER){
            System.out.println("Order transaction");
        }

    }

    public static void enumMethodlar(TransactionType transactionType){

        // Enum yapiya has methodlar.
        System.out.println("Enum name : " + transactionType.name());
        System.out.println("Enum Code Value : " + transactionType.getTransactionCode());
        System.out.println("Enum Ordinal : " +transactionType.ordinal());

    }






}
