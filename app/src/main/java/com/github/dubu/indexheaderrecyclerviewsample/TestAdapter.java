package com.github.dubu.indexheaderrecyclerviewsample;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public abstract class TestAdapter<VH extends RecyclerView.ViewHolder>
    extends RecyclerView.Adapter<VH> {
  private ArrayList<String> items = new ArrayList<String>();

  public TestAdapter() {
    setHasStableIds(true);
  }

  public void add(String object) {
    items.add(object);
    notifyDataSetChanged();
  }

  public void add(int index, String object) {
    items.add(index, object);
    notifyDataSetChanged();
  }

  public void addAll(Collection<? extends String> collection) {
    if (collection != null) {
      items.addAll(collection);
      notifyDataSetChanged();
    }
  }

  public void addAll(String... items) {
    addAll(Arrays.asList(items));
  }

  public void clear() {
    items.clear();
    notifyDataSetChanged();
  }

  public void remove(String object) {
    items.remove(object);
    notifyDataSetChanged();
  }

  public String getItem(int position) {
    return items.get(position);
  }

  @Override
  public long getItemId(int position) {
    return getItem(position).hashCode();
  }

  @Override
  public int getItemCount() {
    return items.size();
  }
}
