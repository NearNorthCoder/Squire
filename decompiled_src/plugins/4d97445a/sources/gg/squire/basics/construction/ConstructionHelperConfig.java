package gg.squire.basics.construction;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
@ConfigGroup("squireconstructionhelper")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/construction/ConstructionHelperConfig.class */
public interface ConstructionHelperConfig extends Config {
    @ConfigSection(name = "Object Settings", description = "Settings related to Objects", position = 10)
    public static final /* synthetic */ String objectsSettings = "Object Settings";

    @ConfigItem(position = 11, keyName = "removeObject", name = "Remove OBJ ID", description = "ID of the object to remove", section = "Object Settings")
    default int removeObjectID() {
        return (-28227) & 32759;
    }

    @ConfigItem(position = 12, keyName = "buildObject", name = "Build OBJ ID", description = "ID of the object to build", section = "Object Settings")
    default int buildObjectID() {
        return " ".length();
    }

    @ConfigItem(position = 13, keyName = "buildOption", name = "Build Option", description = "Build Option", section = "Object Settings")
    default int buildOption() {
        return "   ".length();
    }
}
