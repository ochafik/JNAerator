package gtk;
import _GMemVTable.gsize;
import gtk.GtkLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * Memory allocation virtualization for debugging purposes<br>
 * g_mem_set_vtable() has to be the very first GLib function called<br>
 * if being used<br>
 * <i>native declaration : glib-2.0/glib/gmem.h:240</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public class _GMemVTable extends CPPObject {
	static {
		BridJ.register();
	}
	/** C type : free_callback* */
	@Field(0) 
	public Pointer<_GMemVTable.free_callback > free() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : free_callback* */
	@Field(0) 
	public _GMemVTable free(Pointer<_GMemVTable.free_callback > free) {
		this.io.setPointerField(this, 0, free);
		return this;
	}
	/**
	 * optional; set to NULL if not used !<br>
	 * C type : calloc_callback*
	 */
	@Field(1) 
	public Pointer<_GMemVTable.calloc_callback > calloc() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * optional; set to NULL if not used !<br>
	 * C type : calloc_callback*
	 */
	@Field(1) 
	public _GMemVTable calloc(Pointer<_GMemVTable.calloc_callback > calloc) {
		this.io.setPointerField(this, 1, calloc);
		return this;
	}
	/** C type : try_malloc_callback* */
	@Field(2) 
	public Pointer<_GMemVTable.try_malloc_callback > try_malloc() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : try_malloc_callback* */
	@Field(2) 
	public _GMemVTable try_malloc(Pointer<_GMemVTable.try_malloc_callback > try_malloc) {
		this.io.setPointerField(this, 2, try_malloc);
		return this;
	}
	/** C type : try_realloc_callback* */
	@Field(3) 
	public Pointer<_GMemVTable.try_realloc_callback > try_realloc() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : try_realloc_callback* */
	@Field(3) 
	public _GMemVTable try_realloc(Pointer<_GMemVTable.try_realloc_callback > try_realloc) {
		this.io.setPointerField(this, 3, try_realloc);
		return this;
	}
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class gpointer_callback extends Callback<gpointer_callback > {
		public final void apply(gsize n_bytes) {
			apply(Pointer.getPeer(n_bytes));
		}
		public abstract void apply(@Ptr long n_bytes);
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class gpointer_callback2 extends Callback<gpointer_callback2 > {
		public final void apply(gpointer mem, gsize n_bytes) {
			apply(Pointer.getPeer(mem), Pointer.getPeer(n_bytes));
		}
		public abstract void apply(@Ptr long mem, @Ptr long n_bytes);
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class free_callback extends Callback<free_callback > {
		public final void apply(gpointer mem) {
			apply(Pointer.getPeer(mem));
		}
		public abstract void apply(@Ptr long mem);
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class calloc_callback extends Callback<calloc_callback > {
		public final gpointer apply(gsize n_blocks, gsize n_block_bytes) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(n_blocks), Pointer.getPeer(n_block_bytes)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long n_blocks, @Ptr long n_block_bytes);
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class try_malloc_callback extends Callback<try_malloc_callback > {
		public final gpointer apply(gsize n_bytes) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(n_bytes)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long n_bytes);
	};
	/** <i>native declaration : glib-2.0/glib/gmem.h</i> */
	public static abstract class try_realloc_callback extends Callback<try_realloc_callback > {
		public final gpointer apply(gpointer mem, gsize n_bytes) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(mem), Pointer.getPeer(n_bytes)), .class);
		}
		@Ptr 
		public abstract long apply(@Ptr long mem, @Ptr long n_bytes);
	};
	public _GMemVTable() {
		super();
	}
	public _GMemVTable(Pointer pointer) {
		super(pointer);
	}
}