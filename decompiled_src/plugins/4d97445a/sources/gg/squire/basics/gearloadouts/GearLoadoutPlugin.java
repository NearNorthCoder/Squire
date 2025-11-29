package gg.squire.basics.gearloadouts;

import com.google.inject.Inject;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0022av;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0025ay;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.client.Static;
@SquireUtil
@PluginDescriptor(name = "Squire Gear Loadouts", enabledByDefault = true)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/gearloadouts/GearLoadoutPlugin.class */
public class GearLoadoutPlugin extends Plugin {
    @Inject
    private /* synthetic */ KeyManager bY;
    private /* synthetic */ NavigationButton dH;
    @Inject
    public /* synthetic */ ExecutorService dE;
    private static /* synthetic */ int[] lIlIllIlI;
    @Inject
    private /* synthetic */ ClientToolbar dD;
    private static /* synthetic */ String[] lIlIllIIl;
    private /* synthetic */ C0022av dG;
    public final /* synthetic */ Set<EquipmentSetup> dC = new HashSet();
    private final /* synthetic */ KeyListener dF = new C0025ay(this);

    private static boolean lIIllIIlIlI(int i2) {
        return i2 != 0;
    }

    public void c(List<EquipmentSetup> list) {
        this.dC.clear();
        list.removeIf((v0) -> {
            return Objects.isNull(v0);
        });
        "".length();
        this.dC.addAll(list);
        "".length();
    }

    private static String lIIllIIIlll(String lIlllllIIlllIIl, String lIlllllIIlllIII) {
        try {
            SecretKeySpec lIlllllIIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllllIIlllIII.getBytes(StandardCharsets.UTF_8)), lIlIllIlI[5]), "DES");
            Cipher lIlllllIIlllIll = Cipher.getInstance("DES");
            lIlllllIIlllIll.init(lIlIllIlI[4], lIlllllIIllllII);
            return new String(lIlllllIIlllIll.doFinal(Base64.getDecoder().decode(lIlllllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllllIIlllIlI) {
            lIlllllIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIllIIlIII() {
        lIlIllIIl = new String[lIlIllIlI[4]];
        lIlIllIIl[lIlIllIlI[2]] = lIIllIIIllI("dFbRnkl5pwWWhB9melZTDreUmKcWPPPj", "vjTlZ");
        lIlIllIIl[lIlIllIlI[3]] = lIIllIIIlll("fe7qMBRoPUapS7Sb16J/Kw==", "HBwvt");
    }

    static {
        lIIllIIlIIl();
        lIIllIIlIII();
    }

    private static void lIIllIIlIIl() {
        lIlIllIlI = new int[6];
        lIlIllIlI[0] = 67 ^ 70;
        lIlIllIlI[1] = 18 ^ 49;
        lIlIllIlI[2] = (189 ^ 147) & ((36 ^ 10) ^ (-1));
        lIlIllIlI[3] = " ".length();
        lIlIllIlI[4] = "  ".length();
        lIlIllIlI[5] = 185 ^ 177;
    }

    protected void shutDown() {
        this.dD.removeNavigation(this.dH);
        this.bY.unregisterKeyListener(this.dF);
    }

    private static void bM() {
        if (lIIllIIlIlI(Static.getClient().isTesting() ? 1 : 0)) {
            Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                System.exit(lIlIllIlI[2]);
            }, Rand.nextInt(lIlIllIlI[0], lIlIllIlI[1]), TimeUnit.MINUTES);
            "".length();
        }
    }

    protected void startUp() {
        this.dG = (C0022av) this.injector.getInstance(C0022av.class);
        this.dH = NavigationButton.builder().tooltip(lIlIllIIl[lIlIllIlI[3]]).icon(ImageUtil.loadImageResource(getClass(), lIlIllIIl[lIlIllIlI[2]])).priority(lIlIllIlI[0]).panel(this.dG).build();
        this.dD.addNavigation(this.dH);
        this.bY.registerKeyListener(this.dF);
        this.dE.submit(GearLoadoutPlugin::bM);
        "".length();
    }

    private static String lIIllIIIllI(String lIlllllIlIIIllI, String lIlllllIlIIIlIl) {
        try {
            SecretKeySpec lIlllllIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllllIlIIlIII = Cipher.getInstance("Blowfish");
            lIlllllIlIIlIII.init(lIlIllIlI[4], lIlllllIlIIlIIl);
            return new String(lIlllllIlIIlIII.doFinal(Base64.getDecoder().decode(lIlllllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllllIlIIIlll) {
            lIlllllIlIIIlll.printStackTrace();
            return null;
        }
    }
}
