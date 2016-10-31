package us.tier5.notebook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {

    private ArrayList<Note> notes;
    private NoteAdapter noteAdapter;
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        /*String[] values = new String[]{
              "Android", "Ios", "Ubuntu", "Windows"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);*/
        notes = new ArrayList<Note>();
        notes.add(new Note("testing", "testing", Note.Category.PERSONAL));
        notes.add(new Note("testing1", "testing1", Note.Category.PERSONAL));
        notes.add(new Note("testing2", "testing2", Note.Category.PERSONAL));
        notes.add(new Note("testing3", "testing3", Note.Category.PERSONAL));
        notes.add(new Note("testing4", "testing4", Note.Category.PERSONAL));
        noteAdapter = new NoteAdapter(getActivity(), notes);
        setListAdapter(noteAdapter);
    }
    @Override
    public  void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}
