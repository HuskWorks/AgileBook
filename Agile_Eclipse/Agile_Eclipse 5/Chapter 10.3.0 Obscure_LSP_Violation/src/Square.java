public class Square extends Rectangle {
	
    void SetWidth(double w) {
    	super.SetWidth(w);
    	super.SetHeight(w);
    }
    
    void SetHeight(double h) {
    	super.SetHeight(h); 
    	super.SetWidth(h);   	
    }
}
