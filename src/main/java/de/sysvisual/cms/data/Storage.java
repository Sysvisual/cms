package de.sysvisual.cms.data;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private final static String baseImagePath = "http://localhost:81/assets/produkte/";

    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        Image holzbrettImage = new Image(baseImagePath.concat("holzbrett.jpg"));
        Product holzbrett = new Product("Schneidebrett", holzbrettImage, "Ein Schneidebrett aus Holz mit gravierung");
        products.add(holzbrett);

        Image holzbrett1Image = new Image(baseImagePath.concat("holzbrett1.jpg"));
        Product holzbrett1 = new Product("Schneidebrett 2", holzbrett1Image, "Ein Schneidebrett aus Holz mit gravierung");
        products.add(holzbrett1);

        Image hundemarkeImage = new Image(baseImagePath.concat("hundemarke.jpg"));
        Product hundemarke = new Product("Hundemarke", hundemarkeImage, "Eine Hundemarke in verschiedenen Farben");
        products.add(hundemarke);

        Image schieferImage = new Image(baseImagePath.concat("schiefer.jpg"));
        Product schiefer = new Product("Schiefer", schieferImage, "Eine Schiefertafel mit gravur");
        products.add(schiefer);

        Image shirtImage = new Image(baseImagePath.concat("shirt.jpg"));
        Product shirt = new Product("Shirt", shirtImage, "Ein T-Shirt für z.B. einen Geburtstag mit individuellen Aufdruck!");
        products.add(shirt);

        Image spiegelImage = new Image(baseImagePath.concat("spiegel.jpg"));
        Product spiegel = new Product("Spiegel", spiegelImage, "Ein Spiegel mit gravur");
        products.add(spiegel);

        Image spiegelGrossImage = new Image(baseImagePath.concat("spiegelGross.jpg"));
        Product spiegelGross = new Product("Großer Spiegel", spiegelGrossImage, "Ein großer Spiegel mit gravur");
        products.add(spiegelGross);

        Image thermoflascheImage = new Image(baseImagePath.concat("thermoflasche.jpg"));
        Product thermoflasche = new Product("Termoflasche", thermoflascheImage, "Eine Thermoflasche mit gravur");
        products.add(thermoflasche);

        Image uhrImage = new Image(baseImagePath.concat("uhr.jpg"));
        Product uhr = new Product("Schallplatten-Uhr", uhrImage, "Schallplatte + Uhr = Dieses schöne Teil");
        products.add(uhr);

        Image untersetzterImage = new Image(baseImagePath.concat("untersetzer.jpg"));
        Product untersetzter = new Product("Bambus-Untersetzer", untersetzterImage, "Flaschen oder Glas untersetzter aus Holz mit gravur!");
        products.add(untersetzter);

        return products;
    }

}
