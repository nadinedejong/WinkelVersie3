package nl.model.shop;

public abstract class Product 
	{
	
	//Geeft een korte naam van het product
    public abstract String getNaam();
    public abstract void setNaam(String naam);

    //de prijs voor een bestelling van de gegeven hoeveelheid
    public int getPrijs(int hoeveelheid)
    {
            return this.getPrijsPerEenheid() * hoeveelheid;
    }
    
    //Eenheid waarin het product wordt verkocht(stuks, kilo's, liters, flessen, pakket etc.)
    public abstract int getEenheid();
    public abstract void setEenheid(int eenheid);

    //De prijs per eenheid voor dit product
    public abstract int getPrijsPerEenheid();
    public abstract void setPrijsPerEenheid(int prijsPerEenheid);

    //De URL voor de afbeelding van het product
    public abstract String getImageURL();
    public abstract void setImageURL(String imageURL);

    
    //Constructor 1
    public Product(String naam, int prijsPerEenheid, String imageUrl, int eenheid){
            this.setNaam(naam);
            this.setPrijsPerEenheid(prijsPerEenheid);
            this.setImageURL(imageUrl);
            this.setEenheid(eenheid);
    }
    
    //Constructor 2, met data eenheid "stuks"
    public Product(String naam, int prijspereenheid, String imageUrl)
    		{
            this(naam, prijspereenheid, imageUrl, STUK);
    }
    
    //toont naam, eenheid en prijs
    @Override
    public String toString() 
    		{
            return "Product [getNaam()=" + getNaam() + ", getEenheid()=" + getEenheid() + ", getPrijsPerEenheid()="
                            + getPrijsPerEenheid() + ", getImageURL()=" + getImageURL() + "]";
    }

    //Definieer constantes op de klasse Product voor de eenheden in de webshop
    public static final int GRAM = 1;
    public static final int KILO = 2;
    public static final int LITER = 3;
    public static final int STUK = 4;
    public static final int PAK = 5;
    
}