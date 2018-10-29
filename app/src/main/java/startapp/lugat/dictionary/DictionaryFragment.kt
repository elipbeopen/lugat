package startapp.lugat.dictionary

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import startapp.lugat.R


class DictionaryFragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dictionary_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

}