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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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
public class aR
extends Task {
    private final /* synthetic */ SquireTelegrabConfig eN;
    private static /* synthetic */ int[] llIlIllll;
    private static /* synthetic */ String[] llIlIlllI;

    private static String lIlllIlllll(String lIlIllllIIllIll, String lIlIllllIIllIlI) {
        try {
            SecretKeySpec lIlIllllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllllIIllIlI.getBytes(StandardCharsets.UTF_8)), llIlIllll[4]), "DES");
            Cipher lIlIllllIIlllIl = Cipher.getInstance("DES");
            lIlIllllIIlllIl.init(llIlIllll[5], lIlIllllIIllllI);
            return new String(lIlIllllIIlllIl.doFinal(Base64.getDecoder().decode(lIlIllllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllllIIlllII) {
            lIlIllllIIlllII.printStackTrace();
            return null;
        }
    }

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
    public aR(SquireTelegrabConfig squireTelegrabConfig) {
        this.eN = squireTelegrabConfig;
    }

    private static void lIllllIIIII() {
        llIlIlllI = new String[llIlIllll[0]];
        aR.llIlIlllI[aR.llIlIllll[1]] = aR."Unable to locate spell widget.";
    }

    static {
        aR.lIllllIIIIl();
        aR.lIllllIIIII();
    }

    private static void lIllllIIIIl() {
        llIlIllll = new int[6];
        aR.llIlIllll[0] = 1;
        aR.llIlIllll[1] = (3 ^ 0x50) & ~(0x22 ^ 0x71);
        aR.llIlIllll[2] = 0x48 ^ 0x38 ^ (6 ^ 0x72);
        aR.llIlIllll[3] = -1;
        aR.llIlIllll[4] = 0xE7 ^ 0xB7 ^ (0x14 ^ 0x4C);
        aR.llIlIllll[5] = 2;
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

