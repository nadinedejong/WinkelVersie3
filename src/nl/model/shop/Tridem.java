package nl.model.shop;

public class Tridem extends Product{

	private String klasseNaam = "Tridem";
	private int klasseEenheid = 4;
	private int klassePrijsPerEenheid = 689;
	private String klasseImageURL = "WebContent/tridem.jpg";
	
	
	public Tridem(String naam, int prijspereenheid, String imageUrl) {
		super(naam, prijspereenheid, imageUrl);

	}

	@Override
	public String getNaam() {
		return klasseNaam;
	}

	@Override
	public void setNaam(String naam) {
		this.klasseNaam = naam;
		
	}

	@Override
	public int getEenheid() {
		return klasseEenheid;
	}

	@Override
	public void setEenheid(int eenheid) {
		this.klasseEenheid = eenheid;
	}

	@Override
	public int getPrijsPerEenheid() {
		return klassePrijsPerEenheid;
	}

	@Override
	public void setPrijsPerEenheid(int prijsPerEenheid) {
		this.klassePrijsPerEenheid = prijsPerEenheid;
		
	}

	@Override
	public String getImageURL() {

		return klasseImageURL;
	}

	@Override
	public void setImageURL(String imageURL) {
		this.klasseImageURL = imageURL;
		
	}

}
