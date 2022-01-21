package com.avs.flexboxexample.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/avs/flexboxexample/ui/main/MenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avs/flexboxexample/ui/main/MenuAdapter$ViewHolder;", "dataSet", "", "Lcom/avs/flexboxexample/ui/main/Dish;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "inflater", "Landroid/view/LayoutInflater;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MenuAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.avs.flexboxexample.ui.main.MenuAdapter.ViewHolder> {
    private final java.util.List<com.avs.flexboxexample.ui.main.Dish> dataSet = null;
    private final android.content.Context context = null;
    private final android.view.LayoutInflater inflater = null;
    
    public MenuAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.avs.flexboxexample.ui.main.Dish> dataSet, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.avs.flexboxexample.ui.main.MenuAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.avs.flexboxexample.ui.main.MenuAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/avs/flexboxexample/ui/main/MenuAdapter$ViewHolder;", "Lcom/avs/flexboxexample/ui/main/FlexBoxViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "description", "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "ingredients", "Landroid/widget/LinearLayout;", "getIngredients", "()Landroid/widget/LinearLayout;", "preview", "Lcom/google/android/material/imageview/ShapeableImageView;", "getPreview", "()Lcom/google/android/material/imageview/ShapeableImageView;", "seeMore", "getSeeMore", "title", "getTitle", "app_debug"})
    public static final class ViewHolder extends com.avs.flexboxexample.ui.main.FlexBoxViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView description = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.imageview.ShapeableImageView preview = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout ingredients = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView seeMore = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.imageview.ShapeableImageView getPreview() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getIngredients() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSeeMore() {
            return null;
        }
    }
}