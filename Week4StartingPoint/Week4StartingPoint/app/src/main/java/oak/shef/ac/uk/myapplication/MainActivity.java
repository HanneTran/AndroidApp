package oak.shef.ac.uk.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ImageElement[] myDataset= new ImageElement[3];
    private List<ImageElement> myPictureList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //mRecyclerView = (RecyclerView) findViewById(R.id.my_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.grid_recycler_view);
        int numberOfColumns = 4;
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));


        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(myPictureList);
        mRecyclerView.setAdapter(mAdapter);

        initData();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initData() {
        myPictureList.add(new ImageElement(R.drawable.joe1, "Title1", "path1"));
        myPictureList.add(new ImageElement(R.drawable.joe2, "Title2", "path1"));
        myPictureList.add(new ImageElement(R.drawable.joe3, "Title3", "path1"));
        myPictureList.add(new ImageElement(R.drawable.joe1, "Title4", "path1"));
        myPictureList.add(new ImageElement(R.drawable.joe2, "Title5", "path2"));
        myPictureList.add(new ImageElement(R.drawable.joe3, "Title6", "path2"));
        myPictureList.add(new ImageElement(R.drawable.joe1, "Title7", "path2"));
        myPictureList.add(new ImageElement(R.drawable.joe2, "Title8", "path3"));
        myPictureList.add(new ImageElement(R.drawable.joe3,"Title9", "path3"));
        myPictureList.add(new ImageElement(R.drawable.joe1,"Title10", "path4"));
        myPictureList.add(new ImageElement(R.drawable.joe2,"Title11", "path5"));
        myPictureList.add(new ImageElement(R.drawable.joe3,"Title12", "path5"));
        myPictureList.add(new ImageElement(R.drawable.joe1,"Title13", "path6"));
        myPictureList.add(new ImageElement(R.drawable.joe2,"Title14", "path6"));
        myPictureList.add(new ImageElement(R.drawable.joe3,"Title15", "path6"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
