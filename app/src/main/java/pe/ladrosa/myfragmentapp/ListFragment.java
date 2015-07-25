package pe.ladrosa.myfragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by macmini13 on 25/07/15.
 */

//revisar ciclo de vida de los fragments (que son parte del activity)
//listview es un contenedor de vistas
//hay que crear un  adapter para cada contendor de vistas
public class ListFragment extends Fragment {

    private ListView ListView;
    final private Note[] notes = new Note[]{
            new Note("Title 1","Content 1"),
            new Note("Title 2","Content 2"),
            new Note("Title 3","Content 3"),
            new Note("Title 4","Content 4"),
            new Note("Title 5","Content 5")
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView= (ListView)getView().findViewById(R.id.fragment_list_listview_list);
    }
}
