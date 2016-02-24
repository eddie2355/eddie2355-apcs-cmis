public abstract class SuperHero
   {
   private String suitColor;
   private boolean hasCape;
   private String name;

   public SuperHero()
      {
      this.suitColor = new String();
      this.hasCape = false;
      } // end zero-arg constructor SuperHero

   public void setSuitColor(String suitColor)
      {
      this.suitColor = new String( suitColor );
      } // end method setSuitColor
      
   public String getSuitColor()
      {
      return suitColor;	
      } // end method getSuitColor
   
   public void setName(String name)
   {
       this.name = new String(name);
    }
   
   public String getName()
   {
       return name;
    }
    
   public void setCape(boolean cape)
      {
      this.hasCape = cape;	
      } // end method setCape
      
   public boolean isCaped()
      {
      return hasCape;	
      } // end method isCaped
      
   public abstract String motto();   

   } // end abstract class SuperHero