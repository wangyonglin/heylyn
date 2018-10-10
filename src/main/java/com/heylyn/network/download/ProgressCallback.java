package com.heylyn.network.download;

import com.heylyn.exception.ResultException;

public interface ProgressCallback {
	public void success();
	public void loading(int progress);
	public void failure(ResultException e);
}
