/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Point
 *  net.runelite.api.TileItem
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.client.Static
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.magic.grab.SquireTelegrabConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

@TaskDesc(name="Grabbing")
public class GrabbingTask
extends Task {
    private final  SquireTelegrabConfig eN;

    public void a(WidgetInfo widgetInfo) {
        Client client = Static.getClient();
        Widget widget = client.getWidget(widgetInfo);
        if (aR.lIllllIIIll(widget)) {
            Log.info((String)llIlIlllI[llIlIllll[1]]);
            return;
        }
        client.setSelectedSpellName("<col=00ff00>" + widget.getName() + "</col>");
        client.setSelectedSpellWidget(widget.getId());
        client.setSelectedSpellChildIndex(llIlIllll[3]);
    }

    @Inject
    public GrabbingTask(SquireTelegrabConfig squireTelegrabConfig) {
        this.eN = squireTelegrabConfig;
    }

    private static void lIllllIIIII() {
        llIlIlllI = new String[llIlIllll[0]];
        aR.llIlIlllI[aR.llIlIllll[1]] = "Unable to locate spell widget.";
    }

    static {
        aR.lIllllIIIIl();
        aR.lIllllIIIII();
    }

    public boolean run() {
        int[] nArray = new int[llIlIllll[0]];
        nArray[aR.llIlIllll[1]] = this.eN.target();
        TileItem tileItem = TileItems.getNearest((int[])nArray);
        if (!aR.lIllllIIIlI(Inventory.isFull() ? 1 : 0) || aR.lIllllIIIll(tileItem)) {
            return llIlIllll[1];
        }
        this.a(SpellBook.Standard.TELEKINETIC_GRAB.getWidget());
        Point point = tileItem.getTile().getSceneLocation();
        tileItem.interact(tileItem.getId(), MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId(), point.getX(), point.getY());
        this.sleep(llIlIllll[2]);
        return llIlIllll[0];
    }

    private static boolean lIllllIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIIIll(Object object) {
        return object == null;
    }
}

