package sample.contentful.simplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ConstantResourceAdapter extends RecyclerView.Adapter {
  public static final class ResourceItemViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;

    public ResourceItemViewHolder(View itemView) {
      super(itemView);
      textView = (TextView) itemView;
    }
  }

  private static final List<Integer> elements = new ArrayList<>();

  static {
    elements.add(R.drawable.andes);
    elements.add(R.drawable.congo);
    elements.add(R.drawable.coral);
    elements.add(R.drawable.io2016);
  }

  @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
    final View inflate = layoutInflater.inflate(R.layout.resource_layout, parent, false);
    return new ResourceItemViewHolder(inflate);
  }

  @Override public void onBindViewHolder(RecyclerView.ViewHolder baseHolder, int position) {
    final ResourceItemViewHolder viewHolder = (ResourceItemViewHolder) baseHolder;
    viewHolder.textView.setText(elements.get(position));
  }

  @Override public int getItemCount() {
    return elements.size();
  }
}
