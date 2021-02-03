public class Member extends Person {

    private boolean isBasic;
    private String memberType;
    private int monthlyFee;


    public Member(boolean isBasic, String name, String cpr) {
        super(name, cpr);
        this.isBasic = isBasic;
        if (isBasic) {
            memberType = "Basic";
            monthlyFee = 199;
        } else {
            memberType = "Full";
            monthlyFee = 299;
        }
    }

    public String getMemberType() {
        return memberType;
    }

    public int getMonthlyFee() {
        return monthlyFee;
    }




}
