package oslomet.emanager.inbound;

public class Inbound {
    private int id;

    private int quantity;

    private int produktid;

    private int purchaseorderid;

    private int purchaseorderlineid;

    public Inbound(){

    }

    public Inbound(int id, int quantity, int produktid, int purchaseorderid, int purchaseorderlineid){
        this.id = id;
        this.quantity = quantity;
        this.produktid = produktid;
        this.purchaseorderid = purchaseorderid;
        this.purchaseorderlineid = purchaseorderlineid;
    }

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity = quantity;}

    public int getProduktid(){return produktid;}
    public void setProduktid(int produktid){this.produktid = produktid;}

    public int getPurchaseorderid(){return purchaseorderid;}
    public void setPurchaseorderid(int purchaseorderid){this.purchaseorderid = purchaseorderid;}

    public int getPurchaseorderlineid(){return purchaseorderlineid;}
    public void setPurchaseorderlineid(int purchaseorderlineid){this.purchaseorderlineid = purchaseorderlineid;}

}