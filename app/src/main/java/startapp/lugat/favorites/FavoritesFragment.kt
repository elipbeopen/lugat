package startapp.lugat.favorites

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import startapp.lugat.R

class FavoritesFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.favorites_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}