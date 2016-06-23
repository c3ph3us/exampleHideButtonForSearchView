  /*
  * Copyright © 2015-2016 by ceph3us
  * All Rights Reserved.
  * www.ceph3us.pl
  */
package pl.ceph3us.examplehidebuttonforsearchview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

/**
 * Created by ceph3us on 15.06.16.
 */
public class SentSearch extends Activity {//implements IOnInput {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        final View btnClear = findViewById(R.id.btnSentSearchClear);
        btnClear.setVisibility(View.GONE);
        SearchView sv = (SearchView) findViewById(R.id.svMailSent);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                btnClear.setVisibility(newText != null && !newText.isEmpty() ? View.VISIBLE : View.GONE);
                return false;
            }
        });
    }
}