package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Handling prayers", priority = Integer.MAX_VALUE, register = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ab  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ab.class */
public class ab extends ad {
    private static /* synthetic */ int[] lIllIlIIIllIl;
    public static final /* synthetic */ int aw;
    private static /* synthetic */ String[] lIllIlIIIllII;
    public static final /* synthetic */ int av;
    private /* synthetic */ Prayer ax;

    private static void llIIIllllIIIIII() {
        lIllIlIIIllIl = new int[6];
        lIllIlIIIllIl[0] = ((67 ^ 30) ^ (109 ^ 14)) & (((128 ^ 172) ^ (21 ^ 7)) ^ (-" ".length()));
        lIllIlIIIllIl[1] = " ".length();
        lIllIlIIIllIl[2] = (-((-401) & 27644)) & (-129) & 28415;
        lIllIlIIIllIl[3] = (-4161) & 5206;
        lIllIlIIIllIl[4] = "  ".length();
        lIllIlIIIllIl[5] = 151 ^ 159;
    }

    @Subscribe
    public void b(ProjectileSpawned projectileSpawned) {
        if (llIIIllllIIIIIl(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return;
        }
        EnumC0010k C = C();
        if (llIIIllllIIIIlI(C) || llIIIllllIIIIIl(C.x() ? 1 : 0)) {
            return;
        }
        Projectile projectile = projectileSpawned.getProjectile();
        if (!llIIIllllIIIlIl(projectile.getId(), lIllIlIIIllIl[2])) {
            if (llIIIllllIIIlIl(projectile.getId(), lIllIlIIIllIl[3])) {
                this.ax = Prayer.PROTECT_FROM_MISSILES;
                return;
            }
            return;
        }
        this.ax = Prayer.PROTECT_FROM_MAGIC;
        "".length();
        if ("  ".length() == 0) {
        }
    }

    private static void llIIIlllIllllll() {
        lIllIlIIIllII = new String[lIllIlIIIllIl[4]];
        lIllIlIIIllII[lIllIlIIIllIl[0]] = llIIIlllIlllllI("qDXn1ne/a8I=", "SRmvt");
        lIllIlIIIllII[lIllIlIIIllIl[1]] = llIIIlllIlllllI("7P7NanoGWQOpVV/iGmxxyg==", "TYjgu");
    }

    private static String llIIIlllIlllllI(String llllllllllllllIllIIIllllIlIllIlI, String llllllllllllllIllIIIllllIlIllIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllIlIllIIl.getBytes(StandardCharsets.UTF_8)), lIllIlIIIllIl[5]), "DES");
            Cipher llllllllllllllIllIIIllllIlIlllII = Cipher.getInstance("DES");
            llllllllllllllIllIIIllllIlIlllII.init(lIllIlIIIllIl[4], llllllllllllllIllIIIllllIlIlllIl);
            return new String(llllllllllllllIllIIIllllIlIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllllIlIllIll) {
            llllllllllllllIllIIIllllIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllllIIIlIl(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected ab(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(List<Prayer> list, boolean z) {
        int i = lIllIlIIIllIl[0];
        for (Prayer prayer : list) {
            if (llIIIllllIIIllI(prayer, Prayer.PROTECT_ITEM)) {
                "".length();
                if ("  ".length() < (-" ".length())) {
                    return ((78 ^ 24) ^ (55 ^ 69)) & (((((44 + 73) - 107) + 133) ^ (((8 + 60) - (-3)) + 100)) ^ (-" ".length()));
                }
            } else {
                if (llIIIllllIIIIIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                    int llllllllllllllIllIIIllllIllIIllI = z ? 1 : 0;
                    if (!llIIIllllIIIlII(llllllllllllllIllIIIllllIllIIllI)) {
                        if (llIIIllllIIIIIl(Prayers.isEnabled(prayer) ? 1 : 0)) {
                            i = lIllIlIIIllIl[1];
                        }
                        "".length();
                        if ((((30 ^ 105) ^ (60 ^ 112)) & (("  ".length() ^ (87 ^ 110)) ^ (-" ".length()))) == 0) {
                            return ((39 ^ 43) ^ (156 ^ 179)) & (((((110 + 7) - 114) + 139) ^ (((119 + 102) - 122) + 74)) ^ (-" ".length()));
                        }
                    }
                }
                Widget widget = Widgets.get(prayer.getWidgetInfo());
                if (llIIIllllIIIIlI(widget)) {
                    "".length();
                    if (((58 ^ 105) & ((51 ^ 96) ^ (-1))) < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    WidgetPackets.widgetFirstOption(widget);
                    "".length();
                    if ("  ".length() == 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    "".length();
                    if ((((30 ^ 105) ^ (60 ^ 112)) & (("  ".length() ^ (87 ^ 110)) ^ (-" ".length()))) == 0) {
                    }
                }
            }
        }
        return i;
    }

    static {
        llIIIllllIIIIII();
        llIIIlllIllllll();
        aw = lIllIlIIIllIl[3];
        av = lIllIlIIIllIl[2];
    }

    private static boolean llIIIllllIIIIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIllllIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIllllIIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        Prayer prayer;
        Prayer r;
        if (llIIIllllIIIIIl(C().x() ? 1 : 0)) {
            this.ax = null;
            prayer = C().w().N();
            "".length();
            if ((((149 ^ 199) ^ (75 ^ 47)) & (((109 ^ 60) ^ (247 ^ 144)) ^ (-" ".length()))) != 0) {
                return ((((61 + 88) - 119) + 115) ^ (((34 + 50) - (-28)) + 65)) & (((136 ^ 141) ^ (230 ^ 195)) ^ (-" ".length()));
            }
        } else if (llIIIllllIIIIlI(this.ax)) {
            prayer = C().w().N();
            "".length();
            if ((-"  ".length()) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            prayer = this.ax;
        }
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (llIIIllllIIIIll(fromSlot) && llIIIllllIIIIIl(fromSlot.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[0]]) ? 1 : 0) && !llIIIllllIIIlII(fromSlot.getName().toLowerCase().contains(lIllIlIIIllII[lIllIlIIIllIl[1]]) ? 1 : 0)) {
            r = this.aA.magePrayer().r();
        } else {
            r = this.aA.rangePrayer().r();
            "".length();
            if (((241 ^ 199) & ((88 ^ 110) ^ (-1))) >= " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        ArrayList arrayList = new ArrayList(List.of(prayer, r));
        if (llIIIllllIIIlII(a(arrayList, lIllIlIIIllIl[0]) ? 1 : 0)) {
            sleep(lIllIlIIIllIl[1]);
        }
        a(arrayList, lIllIlIIIllIl[1]);
        "".length();
        return lIllIlIIIllIl[1];
    }

    private static boolean llIIIllllIIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIllllIIIIll(Object obj) {
        return obj != null;
    }
}
