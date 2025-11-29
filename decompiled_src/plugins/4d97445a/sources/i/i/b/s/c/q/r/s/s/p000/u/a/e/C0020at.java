package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Grinding bones", priority = 5, blocking = true, register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.at  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/at.class */
public class C0020at extends AbstractC0019as {
    private static final /* synthetic */ WorldPoint dg;
    private static final /* synthetic */ int dk;
    private static final /* synthetic */ int dj;
    private static /* synthetic */ String[] llIIlIl;
    private static final /* synthetic */ int di;
    private static final /* synthetic */ WorldPoint dh;
    private static final /* synthetic */ WorldPoint df;
    private static /* synthetic */ int[] llIIllI;
    private /* synthetic */ boolean dl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean bE() {
        if (llIIlllll(Players.getLocal().getAnimation(), llIIllI[10])) {
            ?? r0 = llIIllI[2];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllI[1];
    }

    private static boolean llIIllIlI(int i2) {
        return i2 == 0;
    }

    private static String llIIlIllI(String lllIlIIllIIlIIl, String lllIlIIllIIlIII) {
        String str = new String(Base64.getDecoder().decode(lllIlIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllIlIIllIIlIII.toCharArray();
        int lllIlIIllIIIlIl = llIIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIIllI[1];
        while (llIlIIIlI(i2, length)) {
            char lllIlIIllIIlIlI = charArray2[i2];
            sb.append((char) (lllIlIIllIIlIlI ^ charArray[lllIlIIllIIIlIl % charArray.length]));
            "".length();
            lllIlIIllIIIlIl++;
            i2++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIlllll(int i2, int i3) {
        return i2 == i3;
    }

    @Inject
    public C0020at(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private static boolean llIIllIll(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean bF() {
        if (llIIlllll(Players.getLocal().getAnimation(), llIIllI[11])) {
            ?? r0 = llIIllI[2];
            "".length();
            return (-"  ".length()) > 0 ? ((((68 + 10) - 9) + 175) ^ (((81 + 82) - (-16)) + 19)) & (((163 ^ 149) ^ (105 ^ 109)) ^ (-" ".length())) : r0;
        }
        return llIIllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!(llIlIIIIl(chatMessage.getType(), ChatMessageType.SPAM) && llIlIIIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) && llIIlllIl(chatMessage.getMessage().contains(llIIlIl[llIIllI[12]]) ? 1 : 0)) {
            this.dl = llIIllI[2];
        }
    }

    private static String llIIlIlll(String lllIlIIllIllIIl, String lllIlIIllIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIllIllIII.getBytes(StandardCharsets.UTF_8)), llIIllI[12]), "DES");
            Cipher lllIlIIllIllIll = Cipher.getInstance("DES");
            lllIlIIllIllIll.init(llIIllI[0], secretKeySpec);
            return new String(lllIlIIllIllIll.doFinal(Base64.getDecoder().decode(lllIlIIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIllIllIlI) {
            lllIlIIllIllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean bD() {
        if (llIIlllll(Players.getLocal().getAnimation(), llIIllI[9])) {
            ?? r0 = llIIllI[2];
            "".length();
            return (((44 ^ 41) ^ (136 ^ 198)) & (((54 ^ 15) ^ (192 ^ 178)) ^ (-" ".length()))) != 0 ? ((254 ^ 157) ^ (111 ^ 41)) & (((103 ^ 121) ^ (102 ^ 93)) ^ (-" ".length())) : r0;
        }
        return llIIllI[1];
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (!llIIllIlI(EnumC0013am.ECTO_UPSTAIRS.bo() ? 1 : 0) && llIlIIIII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && llIIlllll(inventoryChanged.getItemId(), this.de.bonesToUse().groundItemId)) {
            this.dd.q(this.dd.bl() + llIIllI[2]);
        }
    }

    static {
        llIIllIIl();
        llIIllIII();
        di = llIIllI[9];
        dj = llIIllI[10];
        dk = llIIllI[11];
        df = new WorldPoint(llIIllI[15], llIIllI[16], llIIllI[2]);
        dg = new WorldPoint(llIIllI[17], llIIllI[16], llIIllI[2]);
        dh = new WorldPoint(llIIllI[18], llIIllI[16], llIIllI[2]);
    }

    private static boolean llIlIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llIIllIIl() {
        llIIllI = new int[20];
        llIIllI[0] = "  ".length();
        llIIllI[1] = ((126 ^ 22) ^ (252 ^ 160)) & (((94 ^ 102) ^ (5 ^ 9)) ^ (-" ".length()));
        llIIllI[2] = " ".length();
        llIIllI[3] = (-30817) & 32747;
        llIIllI[4] = "   ".length();
        llIIllI[5] = (111 ^ 4) ^ (228 ^ 139);
        llIIllI[6] = "  ".length() ^ (34 ^ 37);
        llIIllI[7] = 2 ^ 4;
        llIIllI[8] = (49 ^ 120) ^ (205 ^ 131);
        llIIllI[9] = (-10505) & 12153;
        llIIllI[10] = (-((-15697) & 32215)) & (-14338) & 32503;
        llIIllI[11] = (-((-563) & 31675)) & (-6) & 32767;
        llIIllI[12] = 189 ^ 181;
        llIIllI[13] = (((63 + 132) - 36) + 5) ^ (((159 + 156) - 283) + 141);
        llIIllI[14] = (116 ^ 65) ^ (89 ^ 102);
        llIIllI[15] = (-4385) & 8044;
        llIIllI[16] = (-((-27980) & 32127)) & (-16385) & 24055;
        llIIllI[17] = (-((-2937) & 23421)) & (-1) & 24143;
        llIIllI[18] = (-((-194) & 29175)) & (-129) & 32767;
        llIIllI[19] = 183 ^ 188;
    }

    private static boolean llIlIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static String llIIlIlIl(String lllIlIIlllIIllI, String lllIlIIlllIIlIl) {
        try {
            SecretKeySpec lllIlIIlllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIlllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIlllIlIII = Cipher.getInstance("Blowfish");
            lllIlIIlllIlIII.init(llIIllI[0], lllIlIIlllIlIIl);
            return new String(lllIlIIlllIlIII.doFinal(Base64.getDecoder().decode(lllIlIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIlllIIlll) {
            lllIlIIlllIIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v35, types: [boolean] */
    @Override // i.i.b.s.c.q.r.s.s.p000.u.a.e.AbstractC0019as
    public boolean bB() {
        int[] iArr = new int[llIIllI[0]];
        iArr[llIIllI[1]] = this.de.bonesToUse().itemId;
        iArr[llIIllI[2]] = llIIllI[3];
        if (llIIllIlI(Inventory.containsAllOf(iArr) ? 1 : 0)) {
            return llIIllI[1];
        }
        if (llIIllIlI(EnumC0013am.ECTOFUNTUS.bo() ? 1 : 0) && llIIllIlI(EnumC0013am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            return this.dd.bk();
        }
        if (llIIllIlI(EnumC0013am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            String[] strArr = new String[llIIllI[2]];
            strArr[llIIllI[1]] = llIIlIl[llIIllI[1]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (llIIllIll(nearest)) {
                return llIIllI[1];
            }
            nearest.interact(llIIlIl[llIIllI[2]]);
            return llIIllI[2];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
            if (llIIlllIl(tileObject.getName().equals(llIIlIl[llIIllI[13]]) ? 1 : 0)) {
                String[] strArr2 = new String[llIIllI[2]];
                strArr2[llIIllI[1]] = llIIlIl[llIIllI[14]];
                if (llIIlllIl(tileObject.hasAction(strArr2) ? 1 : 0)) {
                    ?? r0 = llIIllI[2];
                    "".length();
                    return 0 != 0 ? ((75 ^ 83) ^ (93 ^ 67)) & (((55 ^ 79) ^ (21 ^ 107)) ^ (-" ".length())) : r0;
                }
            }
            return llIIllI[1];
        });
        String[] strArr2 = new String[llIIllI[2]];
        strArr2[llIIllI[1]] = llIIlIl[llIIllI[0]];
        TileObject nearest3 = TileObjects.getNearest(strArr2);
        String[] strArr3 = new String[llIIllI[2]];
        strArr3[llIIllI[1]] = llIIlIl[llIIllI[4]];
        TileObject nearest4 = TileObjects.getNearest(strArr3);
        if (!llIIlllII(nearest2) || !llIIlllII(nearest3) || llIIllIll(nearest4)) {
            Log.info(llIIlIl[llIIllI[5]]);
            return llIIllI[1];
        } else if (llIIlllIl(this.dl ? 1 : 0)) {
            nearest2.interact(llIIlIl[llIIllI[6]]);
            this.dl = llIIllI[1];
            return llIIllI[2];
        } else if (llIIlllIl(bD() ? 1 : 0)) {
            nearest2.interact(llIIlIl[llIIllI[7]]);
            return llIIllI[2];
        } else if (llIIlllIl(bE() ? 1 : 0)) {
            nearest4.interact(llIIlIl[llIIllI[8]]);
            return llIIllI[2];
        } else {
            int[] iArr2 = new int[llIIllI[2]];
            iArr2[llIIllI[1]] = this.de.bonesToUse().itemId;
            Item first = Inventory.getFirst(iArr2);
            if (llIIllIll(first)) {
                return llIIllI[1];
            }
            if (llIIlllIl(bF() ? 1 : 0)) {
                first.useOn(nearest3);
                sleep(llIIllI[0]);
                return llIIllI[2];
            } else if (llIIllllI(nearest2.distanceTo(Players.getLocal().getWorldLocation()), llIIllI[7])) {
                first.useOn(nearest3);
                sleep(llIIllI[4]);
                return llIIllI[2];
            } else {
                return llIIllI[1];
            }
        }
    }

    private static boolean llIIlllII(Object obj) {
        return obj != null;
    }

    private static boolean llIIllllI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean llIIlllIl(int i2) {
        return i2 != 0;
    }

    private static void llIIllIII() {
        llIIlIl = new String[llIIllI[19]];
        llIIlIl[llIIllI[1]] = llIIlIlIl("j0NP+VI9kadYTG9tPkSdlQ==", "UKIPk");
        llIIlIl[llIIllI[2]] = llIIlIlIl("3uwWPxGWeJnyXX3oI8o/ig==", "eauDT");
        llIIlIl[llIIllI[0]] = llIIlIllI("JCA1Lwoa", "hOTKo");
        llIIlIl[llIIllI[4]] = llIIlIlIl("N6n2lGmSzGk=", "aPYMM");
        llIIlIl[llIIllI[5]] = llIIlIlll("HRKMcY8Vrd4=", "Bdgkf");
        llIIlIl[llIIllI[6]] = llIIlIllI("Og8PHg==", "mfazT");
        llIIlIl[llIIllI[7]] = llIIlIlIl("syY/3qoNbDM=", "rQTCg");
        llIIlIl[llIIllI[8]] = llIIlIlIl("gjmh8TJm9oQ=", "MIakm");
        llIIlIl[llIIllI[12]] = llIIlIlIl("NcF8rqp5xZJnEk01g0cr3lxeGXU9pmdD", "qrahp");
        llIIlIl[llIIllI[13]] = llIIlIlIl("oJoe81D4gPOy4Pvi+ikwjA==", "HVgUW");
        llIIlIl[llIIllI[14]] = llIIlIlIl("Z03j6yEyv4A=", "WHPXy");
    }
}
