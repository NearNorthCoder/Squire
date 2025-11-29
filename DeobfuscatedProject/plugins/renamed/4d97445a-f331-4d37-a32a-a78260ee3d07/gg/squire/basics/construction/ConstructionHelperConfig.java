/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 */
package gg.squire.basics.construction;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(value="squireconstructionhelper")
public interface ConstructionHelperConfig
extends Config {
    @ConfigSection(name="Object Settings", description="Settings related to Objects", position=10)
    public static final /* synthetic */ String objectsSettings;

    @ConfigItem(position=11, keyName="removeObject", name="Remove OBJ ID", description="ID of the object to remove", section="Object Settings")
    default public int removeObjectID() {
        return 0xFFFF91BD & 0x7FF7;
    }

    @ConfigItem(position=12, keyName="buildObject", name="Build OBJ ID", description="ID of the object to build", section="Object Settings")
    default public int buildObjectID() {
        return 1;
    }

    static {
        objectsSettings = "Object Settings";
    }

    @ConfigItem(position=13, keyName="buildOption", name="Build Option", description="Build Option", section="Object Settings")
    default public int buildOption() {
        return 3;
    }
}

