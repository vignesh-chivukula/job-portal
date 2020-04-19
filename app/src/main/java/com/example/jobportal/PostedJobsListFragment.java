package com.example.jobportal;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PostedJobsListFragment extends ListFragment {

    OnJobSelectedListener jobSelectedListener;

    public interface OnJobSelectedListener{
        public void onJobSelected(int jobId);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            jobSelectedListener = (OnJobSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String s =(String)(l.getItemAtPosition(position));
        String jobId = s.split("-")[0];
        // Notify the parent activity of selected item
        jobSelectedListener.onJobSelected(Integer.parseInt(jobId));

        // Set the item as checked to be highlighted when in two-pane layout
        getListView().setItemChecked(position, true);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int layout = R.layout.list_view_custom;
        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, JobsPosted.postedJobs));
    }

    @Override
    public void onStart() {
        super.onStart();

//        if (getFragmentManager().findFragmentById(R.id.news_fragment) != null) {
//            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        }
    }
}
