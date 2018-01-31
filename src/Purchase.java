/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Александр
 */
public class Purchase {
    private Integer purchaseId;
    private Integer count;
    private Integer customerId;
    private Integer produktId;
    
     public Integer  getpurchaseId() {
        return purchaseId;
    }

    public void setpurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getcount() {
        return count;
    }
    public void setcount(int count) {
        this.count = count;
            
    }
    public Integer getcustomerId() {
        return customerId;
    }
    public void setcustomerId(int customerId) {
        this.customerId = customerId;
            
    }
    public Integer getproduktId() {
        return produktId;
    }
    public void setproduktId(int produktId) {
        this.produktId = produktId;
            
    }
        
        
    
}
