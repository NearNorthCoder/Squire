package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Doing task", priority = 50, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aU  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aU.class */
public class aU extends aT {
    private /* synthetic */ aW eu;
    private static /* synthetic */ String[] lIlllllIlII;
    private static final /* synthetic */ int et;
    private static final /* synthetic */ int er;
    private static final /* synthetic */ int es;
    private static /* synthetic */ int[] lIlllllIllI;

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static String lIIllIllIIllll(String llllllllllllllllIlIIlIIllIIllIlI, String llllllllllllllllIlIIlIIllIIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIIllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), lIlllllIllI[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllllIllI[2], llllllllllllllllIlIIlIIllIIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIllIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIllIIllIll) {
            llllllllllllllllIlIIlIIllIIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIlllll(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected aU(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIllIllIllllI(int i, int i2) {
        return i > i2;
    }

    private void bJ() {
        int[] iArr = new int[lIlllllIllI[1]];
        iArr[lIlllllIllI[0]] = lIlllllIllI[3];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIllIllIlllIl(nearest)) {
            return;
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIllIllIllllI(nearest.distanceTo(worldLocation), lIlllllIllI[4])) {
            Movement.setDestination(c(worldLocation, nearest.getWorldLocation()));
        } else {
            nearest.interact(lIlllllIlII[lIlllllIllI[4]]);
        }
    }

    private static boolean lIIllIlllIIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIllIllIlIIII(String llllllllllllllllIlIIlIIllIlIIlll, String llllllllllllllllIlIIlIIllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIllIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIIllIlIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIIllIlIlIIl.init(lIlllllIllI[2], secretKeySpec);
            return new String(llllllllllllllllIlIIlIIllIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIllIlIlIII) {
            llllllllllllllllIlIIlIIllIlIlIII.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIIllIllIllIll(message.contains(lIlllllIlII[lIlllllIllI[0]]) ? 1 : 0) && lIIllIllIllIll(message.contains(lIlllllIlII[lIlllllIllI[1]]) ? 1 : 0) && !lIIllIllIlllII(message.contains(lIlllllIlII[lIlllllIllI[2]]) ? 1 : 0)) {
            return;
        }
        this.eu = null;
    }

    private static boolean lIIllIllIlllIl(Object obj) {
        return obj == null;
    }

    @Subscribe
    public void c(GraphicsObjectCreated graphicsObjectCreated) {
        if (lIIllIllIlllll(graphicsObjectCreated.getGraphicsObject().getId(), lIlllllIllI[8])) {
            WorldPoint fromLocal = WorldPoint.fromLocal(this.cu, graphicsObjectCreated.getGraphicsObject().getLocation());
            int[] iArr = new int[lIlllllIllI[1]];
            iArr[lIlllllIllI[0]] = lIlllllIllI[3];
            TileObject nearest = TileObjects.getNearest(fromLocal, iArr);
            int[] iArr2 = new int[lIlllllIllI[1]];
            iArr2[lIlllllIllI[0]] = lIlllllIllI[5];
            if (!lIIllIlllIIIII(nearest.distanceTo(fromLocal), TileObjects.getNearest(fromLocal, iArr2).distanceTo(fromLocal))) {
                this.eu = aW.VENTS;
                return;
            }
            this.eu = aW.PILLARS;
            "".length();
            if (((87 ^ 52) & ((205 ^ 174) ^ (-1))) >= (120 ^ 124)) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aT
    public boolean bC() {
        if (lIIllIllIlllIl(this.eu)) {
            return lIlllllIllI[0];
        }
        switch (aV.ev[this.eu.ordinal()]) {
            case 1:
                bJ();
                "".length();
                if ((((255 ^ 199) ^ (227 ^ 136)) & (((((27 + 49) - (-18)) + 141) ^ (((27 + 140) - 30) + 47)) ^ (-" ".length()))) != 0) {
                    return ((((30 + 26) - 7) + 99) ^ (((75 + 30) - 65) + 104)) & (((((80 + 44) - 0) + 29) ^ (((129 + 114) - 181) + 95)) ^ (-" ".length()));
                }
                break;
            case 2:
                bK();
                break;
        }
        return lIlllllIllI[1];
    }

    private static void lIIllIllIllIlI() {
        lIlllllIllI = new int[11];
        lIlllllIllI[0] = (159 ^ 167) & ((179 ^ 139) ^ (-1));
        lIlllllIllI[1] = " ".length();
        lIlllllIllI[2] = "  ".length();
        lIlllllIllI[3] = (-1034) & 46527;
        lIlllllIllI[4] = "   ".length();
        lIlllllIllI[5] = (-((-4225) & 4805)) & (-1) & 46079;
        lIlllllIllI[6] = (-((-2989) & 4093)) & (-9) & 28409;
        lIlllllIllI[7] = (((125 + 123) - 110) + 43) ^ (((110 + 4) - (-14)) + 49);
        lIlllllIllI[8] = (-21762) & 23895;
        lIlllllIllI[9] = (8 ^ 116) ^ (32 ^ 89);
        lIlllllIllI[10] = 149 ^ 157;
    }

    private void bK() {
        int[] iArr = new int[lIlllllIllI[1]];
        iArr[lIlllllIllI[0]] = lIlllllIllI[5];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (lIIllIllIlllIl(nearest)) {
            return;
        }
        if (lIIllIllIllIll(Players.getLocal().getWorldLocation().equals(nearest.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination(c(Players.getLocal().getWorldLocation(), nearest.getWorldLocation()));
            return;
        }
        int[] iArr2 = new int[lIlllllIllI[1]];
        iArr2[lIlllllIllI[0]] = lIlllllIllI[6];
        Item first = Inventory.getFirst(iArr2);
        if (lIIllIllIlllIl(first)) {
            return;
        }
        first.interact(lIlllllIlII[lIlllllIllI[7]]);
    }

    static {
        lIIllIllIllIlI();
        lIIllIllIlIIIl();
        et = lIlllllIllI[5];
        es = lIlllllIllI[3];
        er = lIlllllIllI[8];
    }

    private static boolean lIIllIllIlllII(int i) {
        return i != 0;
    }

    private static String lIIllIllIIlllI(String llllllllllllllllIlIIlIIllIllllII, String llllllllllllllllIlIIlIIllIllIllI) {
        String llllllllllllllllIlIIlIIllIllllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIIllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIIllIlllIlI = new StringBuilder();
        char[] llllllllllllllllIlIIlIIllIlllIIl = llllllllllllllllIlIIlIIllIllIllI.toCharArray();
        int llllllllllllllllIlIIlIIllIlllIII = lIlllllIllI[0];
        char[] charArray = llllllllllllllllIlIIlIIllIllllII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIlIIlIIllIllIIII = lIlllllIllI[0];
        while (lIIllIlllIIIII(llllllllllllllllIlIIlIIllIllIIII, length)) {
            char llllllllllllllllIlIIlIIllIlIllll = charArray[llllllllllllllllIlIIlIIllIllIIII];
            llllllllllllllllIlIIlIIllIlllIlI.append((char) (llllllllllllllllIlIIlIIllIlIllll ^ llllllllllllllllIlIIlIIllIlllIIl[llllllllllllllllIlIIlIIllIlllIII % llllllllllllllllIlIIlIIllIlllIIl.length]));
            "".length();
            llllllllllllllllIlIIlIIllIlllIII++;
            llllllllllllllllIlIIlIIllIllIIII++;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIlIIllIlllIlI);
    }

    private static void lIIllIllIlIIIl() {
        lIlllllIlII = new String[lIlllllIllI[9]];
        lIlllllIlII[lIlllllIllI[0]] = lIIllIllIIlllI("IDY+Misgczo7J3I3Lz4jNTYq", "RSNSB");
        lIlllllIlII[lIlllllIllI[1]] = lIIllIllIIlllI("Dx0NEzwAFBEUK0EMEAJuBw0VAj0=", "axxgN");
        lIlllllIlII[lIlllllIllI[2]] = lIIllIllIIllll("1rjY6PfHkQvODCqiFbxlCQ==", "KnmKh");
        lIlllllIlII[lIlllllIllI[4]] = lIIllIllIIlllI("HTA7BQU9", "OUKdl");
        lIlllllIlII[lIlllllIllI[7]] = lIIllIllIlIIII("/eB7EQQmc40=", "Cgmrc");
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.eu = null;
    }

    private static boolean lIIllIllIllIll(int i) {
        return i == 0;
    }
}
