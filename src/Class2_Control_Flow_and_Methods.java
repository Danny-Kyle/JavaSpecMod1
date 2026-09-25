public class Class2_Control_Flow_and_Methods {
    static void main(){
        int i;
        for(i=2; i<5; i++){
            System.out.println(i + "loop runs");
        }

        for (i=3; i>= -2; i--){
            if (i % 2 == 0){
                System.out.println(i + "loop runs");
            } else if (i % 2 != 0){
                System.out.println(i + "loop should have runs");
            }
        }
    }

    static long feeMinor(long amountMinor, int rateBasisPoints){
        if(amountMinor < 0) throw new IllegalArgumentException("amountMinor cannot be negative");
        if (rateBasisPoints > 10000) throw new IllegalArgumentException("rateBasisPoints above 100 percent");
        return amountMinor * rateBasisPoints / 10000;
    }

    static long netMinor(long amountMinor, int rateBasisPoints ){
        if(amountMinor < 0) throw new IllegalArgumentException("amountMinor cannot be negative");
        if (rateBasisPoints > 10000) throw new IllegalArgumentException("rateBasisPoints above 100 percent");
        return amountMinor - rateBasisPoints;


//        for(Payment p: payments){
//            total += p.amountMinor();
//        }
//        if (status == PaymentStatus.Failed){continue;}

//        String PaymentStatus = "Success";
//        switch(PaymentStatus){
//            case PaymentStatus = "Failed":
//                System.out.println("payment failed");
//                break;
//            case PaymentStatus="Success":
//                System.out.println("payment success");
//                break;
//            case PaymentStatus="Pending":
//                System.out.println("payment pending");
//                break;
//            default:
//                System.out.println("payment not started");
//        }
    }


}
