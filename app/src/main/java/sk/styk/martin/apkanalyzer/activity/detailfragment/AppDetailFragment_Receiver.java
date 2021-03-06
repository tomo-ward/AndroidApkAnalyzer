package sk.styk.martin.apkanalyzer.activity.detailfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import sk.styk.martin.apkanalyzer.R;
import sk.styk.martin.apkanalyzer.activity.AppDetailFragment;
import sk.styk.martin.apkanalyzer.adapter.detaillist.ReceiverListAdapter;
import sk.styk.martin.apkanalyzer.model.detail.BroadcastReceiverData;

/**
 * Created by Martin Styk on 30.06.2017.
 */
public class AppDetailFragment_Receiver extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_app_detail_receiver, container, false);

        List<BroadcastReceiverData> data = getArguments().getParcelableArrayList(AppDetailFragment.ARG_CHILD);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_receiver);

        RecyclerView.Adapter adapter = new ReceiverListAdapter(data);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        return rootView;
    }
}
