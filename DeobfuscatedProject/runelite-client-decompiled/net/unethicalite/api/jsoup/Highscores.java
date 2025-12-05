/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jsoup.Jsoup
 *  org.jsoup.nodes.Document
 *  org.jsoup.nodes.Element
 *  org.jsoup.select.Elements
 */
package net.unethicalite.api.jsoup;

import java.io.IOException;
import java.util.Random;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Highscores {
    public static void main(String[] args) {
        System.out.println(Highscores.getRandomUsername());
    }

    public static String getRandomUsername() {
        try {
            int page = new Random().nextInt(50000) + 1;
            String url = "https://secure.runescape.com/m=hiscore_oldschool/overall?table=0&page=" + page;
            Document doc = Jsoup.connect((String)url).get();
            Elements names = doc.select("a[href*='hiscorepersonal?user1=']");
            if (!names.isEmpty()) {
                Element selectedName = (Element)names.get(new Random().nextInt(names.size()));
                Object rawName = selectedName.text().replace("\u00a0", " ").trim();
                int randomNumber = new Random().nextInt(9) + 1;
                if (((String)rawName).length() > 11) {
                    rawName = ((String)rawName).substring(0, ((String)rawName).length() - 2) + ((String)rawName).substring(((String)rawName).length() - 1);
                }
                return (String)rawName + randomNumber;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "Failed to fetch username";
    }
}

