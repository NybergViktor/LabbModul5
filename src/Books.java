public class book {
    private String namn, författare;
    private double pris;

    private boolean tillgängliga;

    /*public book (){
        namn = null;
        författare = null;
        pris = 0; }*/

    public book(String namn, String författare, double pris) {
        this.namn = namn ;
        this.författare = författare;
        this.pris = pris;
        this.tillgängliga = true;

    }

    public String getFörfattare(){
        return författare;
    }
    public String getNamn(){
        return namn;

    }
    public double getpris(){
        return pris;

    }
    public boolean isTillgängliga(){
        return isTillgängliga();
    }
    public void låna(){
        if (isTillgängliga()){


        }

    }


}
