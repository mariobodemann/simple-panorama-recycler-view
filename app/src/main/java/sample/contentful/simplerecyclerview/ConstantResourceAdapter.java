package sample.contentful.simplerecyclerview;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

import java.util.ArrayList;
import java.util.List;

public class ConstantResourceAdapter extends RecyclerView.Adapter {
  public static final class ResourceItemViewHolder extends RecyclerView.ViewHolder {
    private final VrPanoramaView vrPanoramaView;

    public ResourceItemViewHolder(View itemView) {
      super(itemView);
      vrPanoramaView = (VrPanoramaView) itemView;
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
    final Resources resources = viewHolder.vrPanoramaView.getResources();
    final Bitmap bitmap = BitmapFactory.decodeResource(resources, elements.get(position));
    viewHolder.vrPanoramaView.loadImageFromBitmap(bitmap, null);
  }

  @Override public int getItemCount() {
    return elements.size();
  }
}
