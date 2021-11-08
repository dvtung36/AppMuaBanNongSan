package com.example.appsell;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.appsell.databinding.DialogInputStoreBindingImpl;
import com.example.appsell.databinding.FragmentHomeBindingImpl;
import com.example.appsell.databinding.FragmentLoginBindingImpl;
import com.example.appsell.databinding.FragmentMapBindingImpl;
import com.example.appsell.databinding.FragmentRegisterBindingImpl;
import com.example.appsell.databinding.ItemSliderBindingImpl;
import com.example.appsell.databinding.LoadingViewBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_DIALOGINPUTSTORE = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTLOGIN = 3;

  private static final int LAYOUT_FRAGMENTMAP = 4;

  private static final int LAYOUT_FRAGMENTREGISTER = 5;

  private static final int LAYOUT_ITEMSLIDER = 6;

  private static final int LAYOUT_LOADINGVIEW = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.dialog_input_store, LAYOUT_DIALOGINPUTSTORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.fragment_map, LAYOUT_FRAGMENTMAP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.item_slider, LAYOUT_ITEMSLIDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.appsell.R.layout.loading_view, LAYOUT_LOADINGVIEW);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_DIALOGINPUTSTORE: {
          if ("layout/dialog_input_store_0".equals(tag)) {
            return new DialogInputStoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_input_store is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAP: {
          if ("layout/fragment_map_0".equals(tag)) {
            return new FragmentMapBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_map is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSLIDER: {
          if ("layout/item_slider_0".equals(tag)) {
            return new ItemSliderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_slider is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADINGVIEW: {
          if ("layout/loading_view_0".equals(tag)) {
            return new LoadingViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loading_view is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/dialog_input_store_0", com.example.appsell.R.layout.dialog_input_store);
      sKeys.put("layout/fragment_home_0", com.example.appsell.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", com.example.appsell.R.layout.fragment_login);
      sKeys.put("layout/fragment_map_0", com.example.appsell.R.layout.fragment_map);
      sKeys.put("layout/fragment_register_0", com.example.appsell.R.layout.fragment_register);
      sKeys.put("layout/item_slider_0", com.example.appsell.R.layout.item_slider);
      sKeys.put("layout/loading_view_0", com.example.appsell.R.layout.loading_view);
    }
  }
}
