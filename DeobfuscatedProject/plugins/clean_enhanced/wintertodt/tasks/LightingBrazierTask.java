/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.wintertodt.tasks;

import gg.squire.wintertodt.tasks.GameEnum2;
import gg.squire.wintertodt.tasks.WintertodtManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.util.Locale;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Lighting Brazier", priority=2, blocking=true, register=true)
public class LightingBrazierTask
extends Task {
    
    public static final  int Y;
    private final  SquireWintertodtConfig aa;
    private final  b Z;
    private  int ab;

    @Inject
    public LightingBrazierTask(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.ab = 0;
        this.Z = b2;
        this.aa = squireWintertodtConfig;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        o.var13();
        o.var14();
        Y = 7;
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!(string.contains(var2[2] == 0) ? 1 : 0) || (string.contains(var2[6] != 0) ? 1 : 0)) {
            o var15;
            var15.sleep(0);
        }
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        o var28;
        if ((this.Z.i( == 0) ? 1 : 0)) {
            return 0;
        }
        a var29 = var28.Z.q();
        Player var30 = Players.getLocal();
        if ((var28.Z.k() >= 1)) {
            if ((var28.Z.s( != 0) ? 1 : 0)) {
                return 2;
            }
            if (!(var30.isMoving( == 0) ? 1 : 0) || (var29.b().distanceTo((Locatable)var30) < 3)) {
                return 0;
            }
            Movement.walk((WorldPoint)var29.b());
            return 2;
        }
        if ((var29.b().distanceTo((Locatable)var30) > 3)) {
            return 0;
        }
        NPC var31 = NPCs.getNearest((WorldPoint)var29.b(), nPC -> {
            int n2;
            if ((nPC.getId() == 7) && (nPC.distanceTo(var29.b()) <= 5)) {
                n2 = 2;
                0;
                if ((0xF5 ^ 0xB3 ^ (0x1A ^ 0x58)) != (8 + 47 - -3 + 69 ^ (0xC4 ^ 0xBF))) {
                    return ((0xF ^ 0x3E ^ (0x50 ^ 0x36)) & (181 + 101 - 44 + 14 ^ 78 + 151 - 180 + 122 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var31 == null {
            if (var28.ab > 4) {
                var28.Z.r();
                var28.ab = 0;
                return 0;
            }
            if ((var29.b().distanceTo((Locatable)Players.getLocal()) < 5)) {
                var28.ab += 2;
            }
            return 0;
        }
        TileObject var32 = TileObjects.getNearest((WorldPoint)var29.b(), tileObject -> {
            int n2;
            if ((tileObject.getName( != null)) && (tileObject.getName( != 0).toLowerCase(Locale.ROOT).contains(var2[3]) ? 1 : 0)) {
                String[] stringArray = new String[2];
                stringArray[0] = var2[1];
                if ((tileObject.hasActionstringArray) && (var29.b().distanceTo((Locatable)tileObject) <= 3)) {
                    n2 = 2;
                    0;
                    if (3 > 2) return n2 != 0;
                    return ((36 + 126 - 157 + 235 ^ 135 + 23 - 46 + 56) & (0xD1 ^ 0xB7 ^ (0x8F ^ 0xB1) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var32 == null {
            return 0;
        }
        this.ab = 0;
        var4_4.interact(var2[0]);
        this.sleep(6);
        return 2;
    }

}

