// Generated by view binder compiler. Do not edit!
package it.mem.guessTheNumber.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import it.mem.guessTheNumber.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline1;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-sw720dp-land/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   *   <li>layout-land/</li>
   *   <li>layout-sw320dp-land/</li>
   *   <li>layout-sw320dp-port/</li>
   *   <li>layout-sw720dp-port/</li>
   * </ul>
   */
  @Nullable
  public final Guideline guideline15;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final Guideline guideline6;

  @NonNull
  public final Guideline guideline7;

  @NonNull
  public final Guideline guideline8;

  @NonNull
  public final ImageButton ibHello;

  @NonNull
  public final TextView tvHello;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline1,
      @Nullable Guideline guideline15, @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull Guideline guideline4, @NonNull Guideline guideline5, @NonNull Guideline guideline6,
      @NonNull Guideline guideline7, @NonNull Guideline guideline8, @NonNull ImageButton ibHello,
      @NonNull TextView tvHello) {
    this.rootView = rootView;
    this.guideline1 = guideline1;
    this.guideline15 = guideline15;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.guideline5 = guideline5;
    this.guideline6 = guideline6;
    this.guideline7 = guideline7;
    this.guideline8 = guideline8;
    this.ibHello = ibHello;
    this.tvHello = tvHello;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline1;
      Guideline guideline1 = rootView.findViewById(id);
      if (guideline1 == null) {
        break missingId;
      }

      id = R.id.guideline15;
      Guideline guideline15 = rootView.findViewById(id);

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = rootView.findViewById(id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = rootView.findViewById(id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.guideline6;
      Guideline guideline6 = rootView.findViewById(id);
      if (guideline6 == null) {
        break missingId;
      }

      id = R.id.guideline7;
      Guideline guideline7 = rootView.findViewById(id);
      if (guideline7 == null) {
        break missingId;
      }

      id = R.id.guideline8;
      Guideline guideline8 = rootView.findViewById(id);
      if (guideline8 == null) {
        break missingId;
      }

      id = R.id.ib_Hello;
      ImageButton ibHello = rootView.findViewById(id);
      if (ibHello == null) {
        break missingId;
      }

      id = R.id.tv_Hello;
      TextView tvHello = rootView.findViewById(id);
      if (tvHello == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, guideline1, guideline15,
          guideline2, guideline3, guideline4, guideline5, guideline6, guideline7, guideline8,
          ibHello, tvHello);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}