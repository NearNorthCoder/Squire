package i.i.b.s.c.q.r.s.s.p000.u.a.e;

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
@TaskDesc(name = "Grabbing")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aR  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aR.class */
public class aR extends Task {
    private final /* synthetic */ SquireTelegrabConfig eN;
    private static /* synthetic */ int[] llIlIllll;
    private static /* synthetic */ String[] llIlIlllI;

    private static String lIlllIlllll(String lIlIllllIIllIll, String lIlIllllIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllllIIllIlI.getBytes(StandardCharsets.UTF_8)), llIlIllll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIllll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllllIIlllII) {
            lIlIllllIIlllII.printStackTrace();
            return null;
        }
    }

    public void a(WidgetInfo widgetInfo) {
        Client client = Static.getClient();
        Widget widget = client.getWidget(widgetInfo);
        if (lIllllIIIll(widget)) {
            Log.info(llIlIlllI[llIlIllll[1]]);
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
        llIlIlllI[llIlIllll[1]] = lIlllIlllll("haB3dGskcRGVy9o5Gw3Kvco1mBXIR4axMxtdFt07Ohc=", "DEoOk");
    }

    static {
        lIllllIIIIl();
        lIllllIIIII();
    }

    private static void lIllllIIIIl() {
        llIlIllll = new int[6];
        llIlIllll[0] = " ".length();
        llIlIllll[1] = (3 ^ 80) & ((34 ^ 113) ^ (-1));
        llIlIllll[2] = (72 ^ 56) ^ (6 ^ 114);
        llIlIllll[3] = -" ".length();
        llIlIllll[4] = (231 ^ 183) ^ (20 ^ 76);
        llIlIllll[5] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        int[] iArr = new int[llIlIllll[0]];
        iArr[llIlIllll[1]] = this.eN.target();
        TileItem nearest = TileItems.getNearest(iArr);
        if (!lIllllIIIlI(Inventory.isFull() ? 1 : 0) || lIllllIIIll(nearest)) {
            return llIlIllll[1];
        }
        a(SpellBook.Standard.TELEKINETIC_GRAB.getWidget());
        Point sceneLocation = nearest.getTile().getSceneLocation();
        nearest.interact(nearest.getId(), MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId(), sceneLocation.getX(), sceneLocation.getY());
        sleep(llIlIllll[2]);
        return llIlIllll[0];
    }

    private static boolean lIllllIIIlI(int i2) {
        return i2 == 0;
    }

    private static boolean lIllllIIIll(Object obj) {
        return obj == null;
    }
}
