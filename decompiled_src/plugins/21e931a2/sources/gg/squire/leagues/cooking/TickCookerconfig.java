package gg.squire.leagues.cooking;

import java.awt.Label;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
@ConfigGroup("leaguesminer")
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/cooking/TickCookerconfig.class */
public interface TickCookerconfig extends Config {
    @ConfigItem(keyName = "note", name = "Will note food with 'eat' action when 15 or more in inventory", description = "Must have banker note in inventory", position = 3)
    default Label text4() {
        return null;
    }

    @ConfigItem(keyName = "note", name = "Must have banker note in inv", description = "Must have banker note in inventory", position = 0)
    default Label text() {
        return null;
    }

    @ConfigItem(keyName = "note", name = " Put noted food in first inv slot", description = "Must have banker note in inventory", position = 1)
    default Label text2() {
        return null;
    }

    @ConfigItem(keyName = "note", name = "Will auto note burnt food", description = "Must have banker note in inventory", position = 2)
    default Label text3() {
        return null;
    }
}
