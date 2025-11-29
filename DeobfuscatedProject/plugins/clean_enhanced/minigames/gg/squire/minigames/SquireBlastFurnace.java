/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.events.OverlayMenuClicked
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.minigames;

import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.OHelper;
import gg.squire.minigames.MinigamesManager;
import gg.squire.minigames.BankFillingCoalBagTask;
import gg.squire.minigames.DefaultStepTask;
import gg.squire.minigames.EquippingGauntletsTask;
import gg.squire.minigames.TurningRunOnTask;
import gg.squire.minigames.MinigamesManager;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigames.SquireBlastFurnaceConfig;
import gg.squire.minigames.overlays.InstructionOverlay;
import gg.squire.minigames.overlays.StatisticsOverlay;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.events.OverlayMenuClicked;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="Squire Blast Furnace", description="Automatically does blast furnace", enabledByDefault=false)
public class SquireBlastFurnace
extends SquirePlugin {
    
    @Inject
    private  E k;
    @Inject
    private  P p;
    @Inject
    private  Client g;
    @Inject
    private  D t;
    @Inject
    private  O r;
    @Inject
    private  SquireBlastFurnaceConfig i;
    private static final  Pattern f;
    @Inject
    private  N q;
    public static final  int c;
    @Inject
    private  StatisticsOverlay m;
    @Inject
    private  OverlayManager h;
    @Inject
    private  L s;
    public static final  int a;
    @Inject
    private  InstructionOverlay l;
    public static final  WorldPoint d;
    private static final  Pattern e;
    public static final  int b;
    @Inject
    private  G u;
    
    @Inject
    private  K o;
    @Inject
    private  o j;
    @Inject
    private  M n;

    static {
        SquireBlastFurnace.var3();
        SquireBlastFurnace.var4();
        c = 7;
        b = 8;
        a = 9;
        d = new WorldPoint(var1[10], var1[11], 0);
        e = Pattern.compile(I.by);
        f = Pattern.compile(I.bz);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(OverlayMenuClicked overlayMenuClicked) {
        SquireBlastFurnace var11;
        void var12;
        if ((overlayMenuClicked.getOverlay() == overlayMenuClicked.getOverlay()2)this.l) && (overlayMenuClicked.getEntry( != 0).getOption().equals(var2[3]) ? 1 : 0)) {
            this.t.T();
        }
        if ((var12.getOverlay() == var12.getOverlay()2)var11.m) && (var12.getEntry( != 0).getOption().equals(var2[4]) ? 1 : 0)) {
            var11.u.T();
        }
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        SquireBlastFurnace var19;
        void var20;
        if ((menuOptionClicked.getMenuOption( != 0).equals(I.bA) ? 1 : 0)) {
            this.j.k().u();
        }
        if ((var20.getMenuOption( != 0).equals(I.bB) ? 1 : 0)) {
            var19.j.k().t();
        }
        if ((var20.getMenuOption( != 0).equals(I.bC) ? 1 : 0)) {
            var19.u.Z();
        }
        this.t.S();
        0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if ((this.g.getGameState() != this.g.getGameState()2)) {
            return;
        }
        this.a().i();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        switch (gameObject.getId()) {
            case 26707: {
                void var21;
                SquireBlastFurnace var22;
                var22.k.a((GameObject)var21);
                0;
                if (-(0x8F ^ 0x8B) < 0) break;
                return;
            }
            case 9092: 
            case 9100: {
                void var21;
                SquireBlastFurnace var22;
                var22.k.a((GameObject)var21);
            }
        }
    }

    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        if ((itemContainerChanged.getContainerId() == InventoryID.INVENTORY.getId())) {
            this.t.V();
            this.j.i();
        }
        this.t.S();
        0;
    }

    public o a() {
        return this.j;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        if ((configChanged.getGroup( == 0).equals(var2[0]) ? 1 : 0)) {
            return;
        }
        this.t.T();
        this.a().j();
        this.t.V();
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        GameObject gameObject = gameObjectDespawned.getGameObject();
        switch (gameObject.getId()) {
            case 9092: 
            case 9100: {
                SquireBlastFurnace var23;
                var23.t.T();
                var23.u.T();
            }
        }
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        this.u.af();
        this.j.i();
        this.t.S();
        0;
    }

    protected void onStop() {
        this.u.T();
        this.t.T();
        this.a().j();
        this.h.remove((Overlay)this.m);
        0;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = 0;
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = 0;
        while (var32 < var31) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (-(128 + 153 - 213 + 95 ^ 107 + 0 - 43 + 102) < 0) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    protected void onStart() {
        this.h.add((Overlay)this.m);
        0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[1];
        classArray[0] = BankFillingCoalBagTask.class;
        classArray[2] = EquippingGauntletsTask.class;
        classArray[3] = DefaultStepTask.class;
        classArray[4] = TurningRunOnTask.class;
        return classArray;
    }

    public D b() {
        return this.t;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if ((gameStateChanged.getGameState() != gameStateChanged.getGameState()2)) {
            this.t.T();
            this.u.T();
        }
    }

    @Provides
    SquireBlastFurnaceConfig a(ConfigManager configManager) {
        return (SquireBlastFurnaceConfig)configManager.getConfig(SquireBlastFurnaceConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        int n2;
        SquireBlastFurnace var34;
        void var35;
        if ((chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        String var36 = var35.getMessage();
        if ((var34.j.k().w() == 5)) {
            n2 = 3;
            0;
            if (-1 >= 3) {
                return;
            }
        } else {
            n2 = 4;
        }
        int var37 = n2;
        Matcher var38 = f.matcher(var36);
        Matcher var39 = e.matcher(var36);
        if ((var38.matches( != 0) ? 1 : 0)) {
            var34.j.k().t();
            0;
            if (3 < 0) {
                return;
            }
        } else if ((var39.matches( != 0) ? 1 : 0)) {
            var34.j.k().u();
        }
        if ((var36.equals(var2[2] != 0) ? 1 : 0)) {
            int[] nArray = new int[2];
            nArray[0] = 6;
            if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                var34.j.k().c(new int[0]);
                0;
                if (-1 != -1) {
                    return;
                }
            } else {
                int[] nArray2 = new int[2];
                nArray2[0] = 2;
                var34.j.k().c(nArray2);
            }
        }
        if ((var37 == var34.j.k().x())) {
            int[] nArray = new int[2];
            nArray[0] = 0;
            var34.j.k().c(nArray);
            if ((var34.j.k().v() > 2)) {
                var34.j.k().b(0);
            }
        }
        this.t.S();
        0;
    }

}

