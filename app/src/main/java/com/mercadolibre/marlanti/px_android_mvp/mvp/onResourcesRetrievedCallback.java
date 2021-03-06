package com.mercadolibre.marlanti.px_android_mvp.mvp;


import java.util.List;


/**
 * All ResourcesProvider implementations' methods containing api calls
 * MUST receive as @param an <code>OnResourcesRetrievedCallback</code>.
 *
 * See also {@link ResourcesProvider}
 */

public interface OnResourcesRetrievedCallback {
    public <E> void  onSuccess(List<E> data);
    public void onFailure();
}





