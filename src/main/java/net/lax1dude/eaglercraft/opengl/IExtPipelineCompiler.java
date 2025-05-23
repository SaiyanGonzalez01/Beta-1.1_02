package net.lax1dude.eaglercraft.opengl;

import net.lax1dude.eaglercraft.internal.IProgramGL;

/**
 * Copyright (c) 2023 lax1dude. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public interface IExtPipelineCompiler {

	/**
	 * @return new String[] { vshSource, fshSource }
	 */
	String[] getShaderSource(int stateCoreBits, int stateExtBits, Object[] userPointer);

	int getExtensionStatesCount();

	int getCurrentExtensionStateBits(int stateCoreBits);

	int getCoreStateMask(int stateExtBits);

	void initializeNewShader(IProgramGL compiledProg, int stateCoreBits, int stateExtBits, Object[] userPointer);

	void updatePipeline(IProgramGL compiledProg, int stateCoreBits, int stateExtBits, Object[] userPointer);

	void destroyPipeline(IProgramGL shaderProgram, int stateCoreBits, int stateExtBits, Object[] userPointer);

}
