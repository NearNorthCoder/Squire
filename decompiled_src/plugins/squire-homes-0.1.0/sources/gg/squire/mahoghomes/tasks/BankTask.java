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
import net.runelite.api.coords.WorldArea;
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
@TaskDesc(name = "Banking", priority = 25, blocking = true)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/BankTask.class */
public class BankTask extends Task {
    private static final int[] CRAFTING_CAPE_IDS = {9780, 9781};
    private static final int[] MAX_CAPE_IDS = {13280, 13342};
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
        Item item;
        Player local = Players.getLocal();
        if (local == null) {
            return false;
        }
        Home currentHome = this.plugin.getCurrentHome();
        if (currentHome != null && currentHome.getArea().contains2D(local.getWorldLocation())) {
            return false;
        }
        boolean invent = Inventory.isFull() && (!this.config.sack() || this.plankSack.isFull(this.config.contract()));
        if (invent && Bank.isOpen()) {
            Bank.close();
            return false;
        } else if (Dialog.isEnterInputOpen()) {
            Dialog.enterAmount(0);
            return true;
        } else if (!invent && !Dialog.isOpen() && local.getAnimation() != 4413) {
            if (this.plugin.hasItems() && !Bank.isOpen()) {
                return false;
            }
            if (!Movement.shouldWalk()) {
                return true;
            }
            if (!Bank.isOpen()) {
                Locatable nearest = TileObjects.getNearest(to -> {
                    return to.distanceTo(local) <= 8 && (List.of("Bank booth", "Bank chest").contains(to.getName()) || to.hasAction(new String[]{"Bank"}));
                });
                if (nearest == null) {
                    nearest = NPCs.getNearest(n -> {
                        return n.distanceTo(local) <= 8 && n.hasAction((v1) -> {
                            return r1.equals(v1);
                        });
                    });
                }
                if (nearest == null) {
                    return moveToBank();
                }
                if (Reachable.isInteractable(nearest)) {
                    nearest.interact(new String[]{"Bank", "Use"});
                    return true;
                }
                Movement.walkTo(nearest);
                return true;
            } else if (!Inventory.contains(new int[]{2347})) {
                Bank.withdraw(2347, 1, Bank.WithdrawMode.ITEM);
                return true;
            } else if (!Equipment.contains(new int[]{24880}) && !Inventory.contains(new int[]{8794}) && !Inventory.contains(new int[]{9625})) {
                Bank.withdraw(8794, 1, Bank.WithdrawMode.ITEM);
                return true;
            } else {
                int bars = Inventory.getCount(new int[]{2353});
                if (bars < this.config.barAmount()) {
                    Bank.depositAll(new String[]{this.plugin.getConfig().contract().getItemName()});
                    Bank.withdraw("Steel bar", this.config.barAmount() - bars, Bank.WithdrawMode.ITEM);
                    return true;
                } else if (!Inventory.isFull()) {
                    Bank.withdrawAll(this.plugin.getConfig().contract().getItemName(), Bank.WithdrawMode.ITEM);
                    return true;
                } else if (this.config.sack() && !this.plankSack.isFull(this.config.contract()) && (item = this.plankSack.getBankItem()) != null) {
                    item.interact(9, 1007, item.getSlot(), 983043);
                    Bank.withdrawAll(this.plugin.getConfig().contract().getItemName(), Bank.WithdrawMode.ITEM);
                    sleep(2);
                    return true;
                } else {
                    Bank.close();
                    return Inventory.isFull();
                }
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean moveToBank() {
        BankLocation location;
        Player local = Players.getLocal();
        switch (this.config.bankMethod()) {
            case CLOSEST:
                Home currentHome = this.plugin.getCurrentHome();
                if (currentHome == Home.NORMAN || currentHome == Home.LARRY || currentHome == Home.TAU) {
                    location = BankLocation.FALADOR_EAST_BANK;
                } else {
                    location = BankLocation.getNearestCommon();
                }
                WorldArea area = location.getArea();
                if (!area.contains(local)) {
                    Movement.walkTo(area.getCenter());
                    return true;
                }
                return false;
            case CRAFTING_GUILD:
                if (Players.getLocal().isAnimating() || Game.getState() != GameState.LOGGED_IN) {
                    return true;
                }
                if (Equipment.contains(CRAFTING_CAPE_IDS)) {
                    Equipment.getFirst(CRAFTING_CAPE_IDS).interact("Teleport");
                    return true;
                } else if (Inventory.contains(CRAFTING_CAPE_IDS)) {
                    Inventory.getFirst(CRAFTING_CAPE_IDS).interact("Teleport");
                    return true;
                } else {
                    Item cape = Equipment.getFirst(MAX_CAPE_IDS);
                    if (cape != null) {
                        cape.interact("Crafting Guild");
                        return true;
                    }
                }
                break;
            case FALADOR:
                break;
            default:
                return false;
        }
        BankLocation fally = BankLocation.FALADOR_EAST_BANK;
        WorldArea fallyBankArea = fally.getArea();
        if (!fallyBankArea.contains(local)) {
            Movement.walkTo(fallyBankArea.getCenter());
            return true;
        }
        return false;
    }
}
