package mx.utng.mediaplayer;

import androidx.leanback.app.SearchFragment;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.SpeechRecognitionCallback;

public class MediaSearchFragment extends SearchFragment implements
        SpeechRecognitionCallback,
        SearchFragment.SearchResultProvider,
        OnItemViewClickedListener {
    @Override
    public void onItemClicked(Presenter.ViewHolder itemViewHolder,
                              Object item, RowPresenter.ViewHolder rowViewHolder, Row row) {
    }

    @Override
    public ObjectAdapter getResultsAdapter() {
        return null;
    }

    @Override
    public boolean onQueryTextChange(String newQuery) {
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public void recognizeSpeech() {
    }
}