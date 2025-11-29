package gg.squire.basics.combat.SlayerAssistant;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.R;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.S;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.T;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.U;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.NPCManager;
import net.runelite.client.game.NpcUtil;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@PluginDescriptor(name = "Squire Slayer Assistant", description = "Auto-killing blows so you do not have to spend Slayer points on it. Auto-equipping expeditious bracelets/bracelets of slaughter.", enabledByDefault = false)
@SquireUtil
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/SlayerAssistant/SlayerAssistant.class */
public class SlayerAssistant extends SquirePlugin {
    private static /* synthetic */ int[] lIlIlIllI;
    private static /* synthetic */ String[] lIlIlIlIl;
    @Inject
    private /* synthetic */ NPCManager ci;
    @Inject
    private /* synthetic */ NpcUtil ch;

    private static boolean lIIlIllIllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIIlIlllIII(int i2, int i3) {
        return i2 <= i3;
    }

    private static void lIIlIllIlII() {
        lIlIlIllI = new int[7];
        lIlIlIllI[0] = " ".length();
        lIlIlIllI[1] = (47 ^ 35) & ((163 ^ 175) ^ (-1));
        lIlIlIllI[2] = (-((-7246) & 15615)) & (-16905) & 29435;
        lIlIlIllI[3] = -" ".length();
        lIlIlIllI[4] = "   ".length();
        lIlIlIllI[5] = "  ".length();
        lIlIlIllI[6] = (21 ^ 13) ^ (168 ^ 180);
    }

    protected void onStop() {
    }

    private static boolean lIIlIlllIll(int i2) {
        return i2 >= 0;
    }

    private static boolean lIIlIlllIlI(Object obj) {
        return obj == null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIlIllIllI(chatMessage.getMessage().contains(lIlIlIlIl[lIlIlIllI[1]]) ? 1 : 0)) {
            forceStop();
        }
    }

    static {
        lIIlIllIlII();
        lIIlIllIIll();
    }

    private int f(NPC npc) {
        if (!lIIlIlllIIl(npc) || lIIlIlllIlI(npc.getName())) {
            return lIlIlIllI[3];
        }
        int healthScale = npc.getHealthScale();
        int healthRatio = npc.getHealthRatio();
        Integer health = this.ci.getHealth(npc.getId());
        return (lIIlIlllIll(healthRatio) && lIIlIllllII(healthScale) && !lIIlIlllIlI(health)) ? (int) (((health.intValue() * healthRatio) / healthScale) + 0.5f) : lIlIlIllI[3];
    }

    private static boolean lIIlIlllIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        List<NPC> all = NPCs.getAll(npc -> {
            if (lIIlIllllIl(npc.getInteracting(), Players.getLocal())) {
                String[] strArr = new String[lIlIlIllI[0]];
                strArr[lIlIlIllI[1]] = lIlIlIlIl[lIlIlIllI[0]];
                if (lIIlIllIllI(npc.hasAction(strArr) ? 1 : 0) && lIIlIlllIII(npc.getWorldLocation().distanceTo(Players.getLocal()), lIlIlIllI[6])) {
                    ?? r0 = lIlIlIllI[0];
                    "".length();
                    return "  ".length() == 0 ? ((((42 + 101) - (-67)) + 35) ^ (((154 + 20) - 89) + 92)) & (((234 ^ 173) ^ "   ".length()) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIllI[1];
        });
        int[] iArr = new int[lIlIlIllI[0]];
        iArr[lIlIlIllI[1]] = lIlIlIllI[2];
        Item first = Inventory.getFirst(iArr);
        if (lIIlIllIlIl(all.isEmpty() ? 1 : 0)) {
            for (NPC npc2 : all) {
                int f = f(npc2);
                if (lIIlIllIlll(f, lIlIlIllI[3]) && lIIlIlllIII(f, T.GARGOYLES.aQ()) && lIIlIlllIIl(first)) {
                    first.useOn(npc2);
                }
                "".length();
                if (((18 ^ 37) ^ (23 ^ 36)) == "   ".length()) {
                    return;
                }
            }
            Actor interacting = Players.getLocal().getInteracting();
            if (lIIlIllIllI(interacting instanceof NPC ? 1 : 0)) {
                NPC npc3 = (NPC) interacting;
                int f2 = f(npc3);
                if (lIIlIllIlll(f2, lIlIlIllI[3]) && lIIlIlllIII(f2, T.GARGOYLES.aQ()) && lIIlIlllIIl(first)) {
                    first.useOn(npc3);
                }
            }
        }
    }

    private static boolean lIIlIllllII(int i2) {
        return i2 > 0;
    }

    protected void onStart() {
    }

    private static void lIIlIllIIll() {
        lIlIlIlIl = new String[lIlIlIllI[5]];
        lIlIlIlIl[lIlIlIllI[1]] = lIIlIllIIlI("Bj5/5it8IIOAMqVQFkb5fHFxiCQXjt7a", "cmfmU");
        lIlIlIlIl[lIlIlIllI[0]] = lIIlIllIIlI("T5vGG96obVU=", "ncowl");
    }

    private static boolean lIIlIllIlIl(int i2) {
        return i2 == 0;
    }

    private static String lIIlIllIIlI(String lIllllllIlIllll, String lIllllllIlIlllI) {
        try {
            SecretKeySpec lIllllllIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllllllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIllI[5], lIllllllIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllllllIllIIII) {
            lIllllllIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllIlll(int i2, int i3) {
        return i2 > i3;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIlIllI[4]];
        clsArr[lIlIlIllI[1]] = U.class;
        clsArr[lIlIlIllI[0]] = S.class;
        clsArr[lIlIlIllI[5]] = R.class;
        return clsArr;
    }
}
