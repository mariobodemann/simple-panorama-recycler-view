package sample.contentful.simplelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  public static final class ListItemViewHolder extends RecyclerView.ViewHolder {
    public ListItemViewHolder(View itemView) {
      super(itemView);

    }
  }

  @BindView(R.id.main_recycler)
  public RecyclerView recyclerView;

  private RecyclerView.Adapter adapter = new ConstantResourceAdapter();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButterKnife.bind(this);

    recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    recyclerView.setAdapter(adapter);
  }
}
