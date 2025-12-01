package gg.squire.basics.dagannothkings;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0004ad;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0005ae;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0007ag;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0008ah;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0009ai;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0011ak;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aH;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;
@PluginDescriptor(name = "Squire Dagannoth Kings", description = "DK Helper", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/dagannothkings/SquireDagannothKings.class */
public class SquireDagannothKings extends SquirePlugin {
    private static /* synthetic */ int[] lIlIllI;
    private static /* synthetic */ String[] lIlIlIl;
    @Inject
    private /* synthetic */ EventBus K;
    /* synthetic */ List<aH> F = new ArrayList();
    @Inject
    private /* synthetic */ C0005ae cv;
    @Inject
    private /* synthetic */ C0004ad cu;
    @Inject
    /* synthetic */ DagannothKingConfig ct;

    @Provides
    DagannothKingConfig h(ConfigManager configManager) {
        return (DagannothKingConfig) configManager.getConfig(DagannothKingConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) lIlIllI[1]);
        this.F.clear();
        this.K.unregister(this.cu);
        this.K.unregister(this.cv);
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    public List<aH> p() {
        return this.F;
    }

    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        if (lIlIllIll(item.canPickup() ? 1 : 0)) {
            return;
        }
        aH aHVar = new aH();
        String lllIllIlllIIIII = item.getName();
        aHVar.f(item.getId());
        aHVar.i(item.getWorldLocation());
        if (lIlIlllII(lllIllIlllIIIII.contains(lIlIlIl[lIlIllI[1]]) ? 1 : 0)) {
            return;
        }
        this.F.add(aHVar);
        "".length();
        System.out.println("Adding " + Static.getClient().getItemDefinition(aHVar.P()).getName() + " to items to loot");
    }

    private static boolean lIlIllIll(int i2) {
        return i2 == 0;
    }

    private static String lIlIllIII(String lllIllIllIllIII, String lllIllIllIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlIllI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllIllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIllIllIIl) {
            lllIllIllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllII(int i2) {
        return i2 != 0;
    }

    private static void lIlIllIlI() {
        lIlIllI = new int[6];
        lIlIllI[0] = 65 ^ 69;
        lIlIllI[1] = (53 ^ 32) & ((136 ^ 157) ^ (-1));
        lIlIllI[2] = " ".length();
        lIlIllI[3] = "  ".length();
        lIlIllI[4] = "   ".length();
        lIlIllI[5] = 172 ^ 164;
    }

    private static void lIlIllIIl() {
        lIlIlIl = new String[lIlIllI[2]];
        lIlIlIl[lIlIllI[1]] = lIlIllIII("Kk8SQJjkgD0=", "eKZsp");
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIllI[0]];
        clsArr[lIlIllI[1]] = C0009ai.class;
        clsArr[lIlIllI[2]] = C0008ah.class;
        clsArr[lIlIllI[3]] = C0011ak.class;
        clsArr[lIlIllI[4]] = C0007ag.class;
        return clsArr;
    }

    static {
        lIlIllIlI();
        lIlIllIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStart() {
        InteractionManager.setHelper((boolean) lIlIllI[2]);
        this.K.register(this.cu);
        this.K.register(this.cv);
    }
}
