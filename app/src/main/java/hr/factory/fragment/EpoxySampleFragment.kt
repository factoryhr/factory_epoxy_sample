package hr.factory.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import hr.factory.R
import hr.factory.controller.EpoxySampleController
import hr.factory.databinding.FragmentEpoxySampleBinding
import hr.factory.view_model.EpoxySampleVM

class EpoxySampleFragment : Fragment() {
    private lateinit var binding: FragmentEpoxySampleBinding
    private val layoutId = R.layout.fragment_epoxy_sample
    private val viewModel by lazy { EpoxySampleVM() }
    val controller by lazy { EpoxySampleController(viewModel) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = onCreateViewBinding(inflater, container).apply { lifecycleOwner = viewLifecycleOwner }
        return binding.root
    }

    private fun onCreateViewBinding(inflater: LayoutInflater, container: ViewGroup?) : FragmentEpoxySampleBinding {
        return DataBindingUtil.inflate(inflater, layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.epoxyRecyclerView.setController(controller)
        binding.toolbar.callback = viewModel
        observeUI()
    }

    private fun observeUI() {
        viewModel.ui.observe(viewLifecycleOwner, Observer {
            it?.apply {
                controller.setData(this)
            }
        })
    }

}