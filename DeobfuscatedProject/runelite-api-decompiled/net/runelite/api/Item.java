/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemComposition;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.EntityNameable;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Randomizer;

public class Item
implements Interactable,
Identifiable,
EntityNameable {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final int BASE_ACTION_PARAM = 451;
    private static final int MAX_CUSTOM_ACTIONS = 8;
    private final int id;
    private final int quantity;
    private Client client;
    private int slot;
    private int widgetId;

    @Override
    public String getName() {
        String name = this.getComposition().getName();
        if (name == null) {
            return "null";
        }
        return Text.removeTags(Text.sanitize(name));
    }

    public void drop() {
        this.interact("Drop");
    }

    public void useOn(Interactable entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof TileItem) {
            this.useOn((TileItem)entity);
            return;
        }
        if (entity instanceof TileObject) {
            this.useOn((TileObject)entity);
            return;
        }
        if (entity instanceof Item) {
            this.useOn((Item)entity);
            return;
        }
        if (entity instanceof Actor) {
            this.useOn((Actor)entity);
            return;
        }
        if (entity instanceof Widget) {
            this.useOn((Widget)entity);
        }
    }

    public void use() {
        this.client.setSelectedSpellWidget(this.widgetId);
        this.client.setSelectedSpellChildIndex(this.slot);
        this.client.setSelectedSpellItemId(this.id);
    }

    public void useOn(TileItem object) {
        this.use();
        object.interact(0, MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId());
    }

    public void useOn(TileObject object) {
        this.use();
        object.interact(0, MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.getId());
    }

    public void useOn(Item item) {
        this.use();
        item.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId());
    }

    public void useOn(Actor actor) {
        MenuAction menuAction = actor instanceof NPC ? MenuAction.WIDGET_TARGET_ON_NPC : MenuAction.WIDGET_TARGET_ON_PLAYER;
        this.use();
        actor.interact(0, menuAction.getId());
    }

    public void useOn(Widget widget) {
        this.use();
        widget.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId());
    }

    public Type getType() {
        return Type.get(this.widgetId);
    }

    public int calculateWidgetId(WidgetInfo containerInfo) {
        return this.calculateWidgetId(this.client.getWidget(containerInfo));
    }

    public int calculateWidgetId(Widget containerWidget) {
        if (containerWidget == null) {
            return -1;
        }
        Widget[] children = containerWidget.getChildren();
        if (children == null) {
            return -1;
        }
        return Arrays.stream(children).filter(x -> x.getItemId() == this.getId()).findFirst().map(Widget::getId).orElse(-1);
    }

    public ItemComposition getComposition() {
        return this.client.getItemComposition(this.getId());
    }

    public boolean isTradable() {
        return this.getComposition().isTradeable();
    }

    public boolean isStackable() {
        return this.getComposition().isStackable();
    }

    public boolean isMembers() {
        return this.getComposition().isMembers();
    }

    public int getNotedId() {
        return this.getComposition().getLinkedNoteId();
    }

    public boolean isNoted() {
        return this.getComposition().getNote() > -1;
    }

    public boolean isPlaceholder() {
        return this.getComposition().getPlaceholderTemplateId() > -1;
    }

    public int getStorePrice() {
        return this.getComposition().getPrice();
    }

    @Override
    public Point getClickPoint() {
        return Randomizer.getRandomPointIn(this.getBounds());
    }

    @Override
    public String[] getActions() {
        if (this.getType() == Type.EQUIPMENT) {
            ItemComposition composition = this.getComposition();
            if (composition == null) {
                return null;
            }
            String[] actions = new String[8];
            actions[0] = "Remove";
            int index = 1;
            for (int param = 451; param < 458; ++param) {
                actions[index++] = composition.getStringValue(param);
            }
            return actions;
        }
        Widget widget = this.client.getWidget(this.widgetId);
        if (widget != null) {
            Widget itemChild = widget.getChild(this.slot);
            if (itemChild != null) {
                return itemChild.getActions();
            }
            return widget.getActions();
        }
        return null;
    }

    @Override
    public int getActionOpcode(int action) {
        if (action == 0 && this.getActions()[0] == null) {
            return MenuAction.WIDGET_TARGET.getId();
        }
        return action >= 4 ? MenuAction.CC_OP_LOW_PRIORITY.getId() : MenuAction.CC_OP.getId();
    }

    @Override
    public void interact(int index) {
        this.client.interact(this.getMenu(index));
    }

    @Override
    public void interact(int index, int opcode) {
        this.client.interact(this.getMenu(index, opcode));
    }

    @Override
    public void interact(int identifier, int opcode, int param0, int param1) {
        this.client.interact(this.getMenu(identifier, opcode, param0, param1));
    }

    @Override
    public MenuAutomated getMenu(int actionIndex) {
        switch (this.getType()) {
            case TRADE: 
            case TRADE_INVENTORY: {
                Widget itemChild;
                Widget widget = this.client.getWidget(this.widgetId);
                if (widget == null || (itemChild = widget.getChild(this.slot)) == null) break;
                return itemChild.getMenu(actionIndex);
            }
            case EQUIPMENT: 
            case INVENTORY: 
            case BANK: 
            case BANK_INVENTORY: 
            case CHAMBERS_INVENTORY: 
            case CHAMBERS_PRIVATE: 
            case CHAMBERS_SHARED: {
                return this.getMenu(actionIndex, actionIndex > 4 ? MenuAction.CC_OP_LOW_PRIORITY.getId() : MenuAction.CC_OP.getId());
            }
            case UNKNOWN: {
                this.client.getLogger().error("Couldn't determine item type for: {}, widgetid: {}", (Object)this.id, (Object)this.widgetId);
            }
        }
        return null;
    }

    @Override
    public MenuAutomated getMenu(int actionIndex, int opcode) {
        switch (this.getType()) {
            case TRADE: 
            case TRADE_INVENTORY: {
                Widget itemWidget = this.client.getWidget(this.widgetId);
                if (itemWidget == null) {
                    return null;
                }
                return itemWidget.getMenu(actionIndex, opcode);
            }
            case EQUIPMENT: {
                return this.getMenu(actionIndex + 1, opcode, -1, this.widgetId, this.id);
            }
            case INVENTORY: {
                return this.getMenu(actionIndex == 0 ? 0 : actionIndex + 1, opcode, this.getSlot(), this.widgetId, this.id);
            }
            case BANK: {
                return this.getMenu(actionIndex, opcode, this.getSlot(), WidgetInfo.BANK_ITEM_CONTAINER.getPackedId(), this.id);
            }
            case BANK_INVENTORY: {
                return this.getMenu(actionIndex + 1, opcode, this.getSlot(), WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER.getPackedId(), this.id);
            }
            case CHAMBERS_INVENTORY: 
            case CHAMBERS_PRIVATE: 
            case CHAMBERS_SHARED: {
                return this.getMenu(actionIndex + 1, opcode, this.getSlot(), this.widgetId, this.id);
            }
            case UNKNOWN: {
                this.client.getLogger().error("Couldn't determine item type for: {}, widgetid: {}, itemid: {}", this.id, this.widgetId, this.id);
            }
        }
        return null;
    }

    private Rectangle getBounds() {
        Widget slot;
        Widget widget = this.client.getWidget(this.getWidgetId());
        if (widget == null) {
            return new Rectangle(-1, -1, 0, 0);
        }
        if (this.getType() != Type.EQUIPMENT && (slot = widget.getChild(this.getSlot())) != null) {
            return slot.getBounds() != null ? slot.getBounds() : new Rectangle(-1, -1, 0, 0);
        }
        Rectangle bounds = widget.getBounds();
        if (bounds == null) {
            Rectangle itemBounds = widget.getChild(this.getSlot()).getBounds();
            return itemBounds != null ? itemBounds : new Rectangle(-1, -1, 0, 0);
        }
        return bounds;
    }

    public Item(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Client getClient() {
        return this.client;
    }

    public int getSlot() {
        return this.slot;
    }

    public int getWidgetId() {
        return this.widgetId;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public void setWidgetId(int widgetId) {
        this.widgetId = widgetId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        Item other = (Item)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getId() != other.getId()) {
            return false;
        }
        if (this.getQuantity() != other.getQuantity()) {
            return false;
        }
        if (this.getSlot() != other.getSlot()) {
            return false;
        }
        if (this.getWidgetId() != other.getWidgetId()) {
            return false;
        }
        Client this$client = this.getClient();
        Client other$client = other.getClient();
        return !(this$client == null ? other$client != null : !this$client.equals(other$client));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Item;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getId();
        result = result * 59 + this.getQuantity();
        result = result * 59 + this.getSlot();
        result = result * 59 + this.getWidgetId();
        Client $client = this.getClient();
        result = result * 59 + ($client == null ? 43 : $client.hashCode());
        return result;
    }

    public String toString() {
        return "Item(id=" + this.getId() + ", quantity=" + this.getQuantity() + ", client=" + String.valueOf(this.getClient()) + ", slot=" + this.getSlot() + ", widgetId=" + this.getWidgetId() + ")";
    }

    public static enum Type {
        INVENTORY(InventoryID.INVENTORY),
        EQUIPMENT(InventoryID.EQUIPMENT),
        BANK(InventoryID.BANK),
        BANK_INVENTORY(InventoryID.INVENTORY),
        TRADE(InventoryID.TRADE),
        TRADE_INVENTORY(InventoryID.INVENTORY),
        CHAMBERS_SHARED(InventoryID.CHAMBERS_OF_XERIC_SHARED),
        CHAMBERS_PRIVATE(InventoryID.CHAMBERS_OF_XERIC_PRIVATE),
        CHAMBERS_INVENTORY(InventoryID.INVENTORY),
        UNKNOWN(null);

        private final InventoryID inventoryID;

        private Type(InventoryID inventoryID) {
            this.inventoryID = inventoryID;
        }

        private static Type get(int widgetId) {
            switch (WidgetInfo.TO_GROUP(widgetId)) {
                case 335: {
                    return TRADE;
                }
                case 336: {
                    return TRADE_INVENTORY;
                }
                case 387: {
                    return EQUIPMENT;
                }
                case 12: {
                    return BANK;
                }
                case 15: {
                    return BANK_INVENTORY;
                }
                case 149: {
                    return INVENTORY;
                }
                case 271: {
                    return CHAMBERS_PRIVATE;
                }
                case 550: {
                    return CHAMBERS_SHARED;
                }
                case 551: {
                    return CHAMBERS_INVENTORY;
                }
            }
            return UNKNOWN;
        }

        public InventoryID getInventoryID() {
            return this.inventoryID;
        }
    }
}

