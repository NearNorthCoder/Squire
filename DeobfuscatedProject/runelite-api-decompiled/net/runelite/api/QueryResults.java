/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.Nullable;

public class QueryResults<EntityType>
implements Collection<EntityType> {
    public final ArrayList<EntityType> list;

    public QueryResults(Collection<? extends EntityType> results) {
        this.list = results == null ? new ArrayList() : (results instanceof ArrayList ? (ArrayList<Object>)results : new ArrayList<EntityType>(results));
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return this.list.contains(o);
    }

    @Override
    public Iterator<EntityType> iterator() {
        return this.list.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public <entityType> entityType[] toArray(entityType[] a) {
        return this.list.toArray();
    }

    @Override
    public boolean add(EntityType entityType) {
        return this.list.add(entityType);
    }

    @Override
    public boolean remove(Object o) {
        return this.list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends EntityType> c) {
        return this.list.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.list.retainAll(c);
    }

    @Override
    public void clear() {
        this.list.clear();
    }

    @Nullable
    public final EntityType first() {
        return this.size() == 0 ? null : (EntityType)this.get(0);
    }

    @Nullable
    public final EntityType last() {
        int size = this.size();
        return size == 0 ? null : (EntityType)this.get(size - 1);
    }

    public EntityType get(int index) {
        return this.list.get(index);
    }

    public final QueryResults limit(int entries) {
        return this.limit(0, entries);
    }

    public final QueryResults limit(int startIndex, int amount) {
        ArrayList<EntityType> limitedList = new ArrayList<EntityType>(amount);
        for (int i = startIndex; i < this.size() && i - startIndex < amount; ++i) {
            limitedList.add(this.get(i));
        }
        this.list.retainAll(limitedList);
        return this;
    }
}

