/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Home;
import gg.squire.mahoghomes.model.PlankSack;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=25, blocking=true)
public class BankTask
extends Task {
    private static final int[] CRAFTING_CAPE_IDS = new int[]{9780, 9781};
    private static final int[] MAX_CAPE_IDS = new int[]{13280, 13342};
    private final SquireHomesPlugin plugin;
    private final SquireHomesConfig config;
    private final PlankSack plankSack;

    @Inject
    public BankTask(SquireHomesPlugin plugin, SquireHomesConfig config, PlankSack plankSack) {
        this.plugin = plugin;
        this.config = config;
        this.plankSack = plankSack;
    }

    public boolean run() {
        boolean invent;
        Player local = Players.getLocal();
        if (local == null) {
            return false;
        }
        Home currentHome = this.plugin.getCurrentHome();
        if (currentHome != null && currentHome.getArea().contains2D(local.getWorldLocation())) {
            return false;
        }
        boolean bl = invent = Inventory.isFull() && (!this.config.sack() || this.plankSack.isFull(this.config.contract()));
        if (invent && Bank.isOpen()) {
            Bank.close();
            return false;
        }
        if (Dialog.isEnterInputOpen()) {
            Dialog.enterAmount((int)0);
            return true;
        }
        if (invent || Dialog.isOpen() || local.getAnimation() == 4413 || this.plugin.hasItems() && !Bank.isOpen()) {
            return false;
        }
        if (!Movement.shouldWalk()) {
            return true;
        }
        if (Bank.isOpen()) {
            Item item;
            if (!Inventory.contains((int[])new int[]{2347})) {
                Bank.withdraw((int)2347, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return true;
            }
            if (!(Equipment.contains((int[])new int[]{24880}) || Inventory.contains((int[])new int[]{8794}) || Inventory.contains((int[])new int[]{9625}))) {
                Bank.withdraw((int)8794, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return true;
            }
            int bars = Inventory.getCount((int[])new int[]{2353});
            if (bars < this.config.barAmount()) {
                Bank.depositAll((String[])new String[]{this.plugin.getConfig().contract().getItemName()});
                Bank.withdraw((String)"Steel bar", (int)(this.config.barAmount() - bars), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return true;
            }
            if (!Inventory.isFull()) {
                Bank.withdrawAll((String)this.plugin.getConfig().contract().getItemName(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return true;
            }
            if (this.config.sack() && !this.plankSack.isFull(this.config.contract()) && (item = this.plankSack.getBankItem()) != null) {
                item.interact(9, 1007, item.getSlot(), 983043);
                Bank.withdrawAll((String)this.plugin.getConfig().contract().getItemName(), (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                this.sleep(2);
                return true;
            }
            Bank.close();
            return Inventory.isFull();
        }
        TileObject bank = TileObjects.getNearest(to -> to.distanceTo((Locatable)local) <= 8 && (List.of("Bank booth", "Bank chest").contains(to.getName()) || to.hasAction(new String[]{"Bank"})));
        if (bank == null) {
            bank = NPCs.getNearest(n -> n.distanceTo((Locatable)local) <= 8 && n.hasAction("Bank"::equals));
        }
        if (bank == null) {
            return this.moveToBank();
        }
        if (Reachable.isInteractable((Locatable)((Locatable)bank))) {
            bank.interact(new String[]{"Bank", "Use"});
        } else {
            Movement.walkTo((Locatable)((Locatable)bank));
        }
        return true;
    }

    private boolean moveToBank() {
        Player local = Players.getLocal();
        switch (this.config.bankMethod()) {
            case CLOSEST: {
                Home currentHome = this.plugin.getCurrentHome();
                BankLocation location = currentHome == Home.NORMAN || currentHome == Home.LARRY || currentHome == Home.TAU ? BankLocation.FALADOR_EAST_BANK : BankLocation.getNearestCommon();
                WorldArea area = location.getArea();
                if (area.contains((Locatable)local)) break;
                Movement.walkTo((WorldPoint)area.getCenter());
                return true;
            }
            case CRAFTING_GUILD: {
                if (Players.getLocal().isAnimating() || Game.getState() != GameState.LOGGED_IN) {
                    return true;
                }
                if (Equipment.contains((int[])CRAFTING_CAPE_IDS)) {
                    Equipment.getFirst((int[])CRAFTING_CAPE_IDS).interact("Teleport");
                    return true;
                }
                if (Inventory.contains((int[])CRAFTING_CAPE_IDS)) {
                    Inventory.getFirst((int[])CRAFTING_CAPE_IDS).interact("Teleport");
                    return true;
                }
                Item cape = Equipment.getFirst((int[])MAX_CAPE_IDS);
                if (cape != null) {
                    cape.interact("Crafting Guild");
                    return true;
                }
            }
            case FALADOR: {
                BankLocation fally = BankLocation.FALADOR_EAST_BANK;
                WorldArea fallyBankArea = fally.getArea();
                if (fallyBankArea.contains((Locatable)local)) break;
                Movement.walkTo((WorldPoint)fallyBankArea.getCenter());
                return true;
            }
        }
        return false;
    }
}

