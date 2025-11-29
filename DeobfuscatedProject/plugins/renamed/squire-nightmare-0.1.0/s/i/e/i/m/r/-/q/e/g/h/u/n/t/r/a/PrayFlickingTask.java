/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Pray Flicking -> PrayflickingTask */
@TaskDesc(name="Pray Flicking", priority=0x7FFFFFFF)
public class PrayFlickingTask
extends Task {
    private /* synthetic */ ArrayList<Prayer> dO;
    private final /* synthetic */ SquireNightmareConfig dM;
    private static final /* synthetic */ Logger dK;
    private static /* synthetic */ String[] llllIlIIlllI;
    private final /* synthetic */ SquireNightmarePlugin dN;
    private static /* synthetic */ int[] llllIlIIllll;
    private final /* synthetic */ Client dL;

    private static boolean lIIlIIIIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIIllIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIIIllIIlII(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIIIlIlIllI() {
        llllIlIIlllI = new String[llllIlIIllll[1]];
        ad.llllIlIIlllI[ad.llllIlIIllll[0]] = ad."husk";
    }

    private static boolean lIIlIIIIlIllIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIIIlIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIlIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ad.lIIlIIIIlIlIlll();
        ad.lIIlIIIIlIlIllI();
        dK = LoggerFactory.getLogger(PrayFlickingTask.class);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ad var1;
        if (ad.lIIlIIIIlIllIII(Prayers.anyActive() ? 1 : 0) && ad.lIIlIIIIlIllIII(this.dL.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIIllll[0];
        }
        if (ad.lIIlIIIIlIllIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER))) {
            return llllIlIIllll[0];
        }
        NPC var6 = SquireNightmarePlugin.d();
        if (ad.lIIlIIIIlIllIII(var1.dL.isInInstancedRegion() ? 1 : 0)) {
            Prayers.disableAll();
            return llllIlIIllll[1];
        }
        if (ad.lIIlIIIIlIllIlI(var6)) {
            return llllIlIIllll[0];
        }
        List<Prayer> list = this.q(var1_1.getAnimation());
        Prayers.flick(list);
        0;
        return llllIlIIllll[1];
    }

    private static String lIIlIIIIlIlIlII(String var3, String var14) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llllIlIIllll[5], var10);
            return new String(var7.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIIlIlIlll() {
        llllIlIIllll = new int[14];
        ad.llllIlIIllll[0] = (0xAB ^ 0xB4) & ~(0x58 ^ 0x47);
        ad.llllIlIIllll[1] = 1;
        ad.llllIlIIllll[2] = -(0xFFFFF2BF & 0x6D7B) & (0xFFFFEFFF & 0x7F7F);
        ad.llllIlIIllll[3] = 156 + 89 - 156 + 93 ^ 17 + 103 - 74 + 144;
        ad.llllIlIIllll[4] = 3;
        ad.llllIlIIllll[5] = 2;
        ad.llllIlIIllll[6] = -(0xFFFFBA95 & 0x6D7B) & (0xFFFFBD5D & 0x7FFE);
        ad.llllIlIIllll[7] = 0xD0 ^ 0x9D;
        ad.llllIlIIllll[8] = 0x3D ^ 0x39;
        ad.llllIlIIllll[9] = 0x8C ^ 0x96 ^ (0x35 ^ 0x29);
        ad.llllIlIIllll[10] = 0xFFFFBF93 & 0x61FE;
        ad.llllIlIIllll[11] = 0xFFFFAFDA & 0x7BB7;
        ad.llllIlIIllll[12] = -(0xFFFFB9BD & 0x5E6F) & (0xFFFFBBBF & 0x7DFF);
        ad.llllIlIIllll[13] = 0xFFFFA3BE & 0x7DD5;
    }

    @Inject
    public ad(Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.dO = new ArrayList();
        this.dL = client;
        this.dM = squireNightmareConfig;
        this.dN = squireNightmarePlugin;
    }

    private static boolean lIIlIIIIlIllllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private List<Prayer> q(int var4) {
        ArrayList<Prayer> arrayList;
        ad var5;
        Object var2;
        ArrayList<Prayer> var8 = new ArrayList<Prayer>();
        int[] var12 = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC var9 = NPCs.getAll((int[])var12).stream().filter(nPC -> {
            boolean bl;
            if (ad.lIIlIIIIlIllIII(nPC.isDead() ? 1 : 0)) {
                bl = llllIlIIllll[1];
                0;
                if (-3 > 0) {
                    return ((3 ^ (0x5F ^ 2)) & (63 + 156 - 134 + 72 ^ 50 + 159 - 107 + 93 ^ -1)) != 0;
                }
            } else {
                bl = llllIlIIllll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (ad.lIIlIIIIlIllIlI(var9)) {
            if (ad.lIIlIIIIlIllIll(Static.getClient().getVarbitValue(llllIlIIllll[2]), llllIlIIllll[3])) {
                Prayer[] prayerArray = new Prayer[llllIlIIllll[4]];
                prayerArray[ad.llllIlIIllll[0]] = Prayer.INCREDIBLE_REFLEXES;
                prayerArray[ad.llllIlIIllll[1]] = Prayer.ULTIMATE_STRENGTH;
                prayerArray[ad.llllIlIIllll[5]] = Prayer.STEEL_SKIN;
                var2 = Arrays.asList(prayerArray);
                var8.addAll((Collection<Prayer>)var2);
                0;
                0;
                if (3 != 3) {
                    return null;
                }
            } else {
                var8.add(Prayer.PIETY);
                0;
                0;
                
                }
            }
        } else if (ad.lIIlIIIIlIlllII(Vars.getBit((int)llllIlIIllll[6])) && ad.lIIlIIIIlIlllIl(Skills.getLevel((Skill)Skill.PRAYER), llllIlIIllll[7])) {
            var8.add(Prayer.AUGURY);
            0;
            0;
            
            }
        } else {
            var8.add(Prayer.MYSTIC_MIGHT);
            0;
        }
        var2 = SquireNightmarePlugin.d();
        NPC var11 = NPCs.getNearest(nPC -> {
            int n2;
            if (ad.lIIlIIIIllIIlII(nPC.getName().equalsIgnoreCase(llllIlIIlllI[llllIlIIllll[0]]) ? 1 : 0) && ad.lIIlIIIIlIllIII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIIllll[1];
                0;
                if (2 <= 0) {
                    return false;
                }
            } else {
                n2 = llllIlIIllll[0];
            }
            return n2 != 0;
        });
        if (ad.lIIlIIIIlIllllI(var11) && ad.lIIlIIIIlIlllll(var5.dN.Q(), llllIlIIllll[8]) && (!ad.lIIlIIIIllIIIII(var5.dN.R(), llllIlIIllll[9]) || ad.lIIlIIIIllIIIIl(var5.dN.R(), llllIlIIllll[8])) && (!ad.lIIlIIIIlIllIll(var4, llllIlIIllll[10]) || ad.lIIlIIIIllIIIlI(var5.dN.S(), Prayer.PROTECT_FROM_MELEE))) {
            var8.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (((0x1E ^ 0x63 ^ (0x23 ^ 0x67)) & (110 + 78 - 65 + 52 ^ 61 + 140 - 51 + 0 ^ -1)) != 0) {
                return null;
            }
        } else if (ad.lIIlIIIIlIllllI(var11) && ad.lIIlIIIIlIlllll(var5.dN.Q(), llllIlIIllll[8]) && (!ad.lIIlIIIIllIIIII(var5.dN.R(), llllIlIIllll[9]) || ad.lIIlIIIIllIIIIl(var5.dN.R(), llllIlIIllll[4]))) {
            var8.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (-3 >= 0) {
                return null;
            }
        } else if (ad.lIIlIIIIlIllllI(var11) && (!ad.lIIlIIIIllIIIII(var5.dN.R(), llllIlIIllll[9]) || ad.lIIlIIIIllIIIIl(var5.dN.R(), llllIlIIllll[4]))) {
            var8.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (-1 > 0) {
                return null;
            }
        } else if (ad.lIIlIIIIlIlllll(var2.getId(), llllIlIIllll[11])) {
            var8.add(Prayer.REDEMPTION);
            0;
            0;
            if (((0x11 ^ 0x44) & ~(0xEA ^ 0xBF)) != 0) {
                return null;
            }
        } else if (ad.lIIlIIIIlIllIII(var5.dN.al() ? 1 : 0)) {
            if (ad.lIIlIIIIlIlllll(var4, llllIlIIllll[12])) {
                var8.add(Prayer.PROTECT_FROM_MAGIC);
                0;
                var5.dN.a(Prayer.PROTECT_FROM_MAGIC);
            }
            if (ad.lIIlIIIIlIlllll(var4, llllIlIIllll[13])) {
                var8.add(Prayer.PROTECT_FROM_MISSILES);
                0;
                var5.dN.a(Prayer.PROTECT_FROM_MISSILES);
            }
            if (ad.lIIlIIIIlIlllll(var4, llllIlIIllll[10])) {
                var8.add(Prayer.PROTECT_FROM_MELEE);
                0;
                var5.dN.a(Prayer.PROTECT_FROM_MELEE);
                0;
                
                }
            }
        } else {
            if (ad.lIIlIIIIlIlllll(var4, llllIlIIllll[12])) {
                var8.add(Prayer.PROTECT_FROM_MELEE);
                0;
                var5.dN.a(Prayer.PROTECT_FROM_MELEE);
            }
            if (ad.lIIlIIIIlIlllll(var4, llllIlIIllll[13])) {
                var8.add(Prayer.PROTECT_FROM_MAGIC);
                0;
            }
            if (ad.lIIlIIIIlIlllll(var4, llllIlIIllll[10])) {
                var8.add(Prayer.PROTECT_FROM_MISSILES);
                0;
            }
        }
        if (ad.lIIlIIIIllIIIll(var8.size(), llllIlIIllll[1])) {
            var5.dO = var8;
        }
        if (ad.lIIlIIIIllIIIll(var8.size(), llllIlIIllll[1])) {
            arrayList = var8;
            0;
            if (((0x7D ^ 0x59) & ~(0x7A ^ 0x5E)) > 2) {
                return null;
            }
        } else {
            arrayList = var5.dO;
        }
        return arrayList;
    }

    private static boolean lIIlIIIIllIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIlIllIIl(int n2) {
        return n2 <= 0;
    }
}

